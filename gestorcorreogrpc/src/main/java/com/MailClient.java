package com;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.ArrayList;
import java.util.List;

public class MailClient {
    private MailServiceGrpc.MailServiceBlockingStub mailServiceStub;
    private String destinatario;
    private List<Mail> historialDeCorreos;

    public MailClient(String host, int port, String destinatario) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.mailServiceStub = MailServiceGrpc.newBlockingStub(channel);
        this.destinatario = destinatario;
        this.historialDeCorreos = new ArrayList<>(); // inicializamos el historial
    }

    public void enviarCorreo(String titulo, String mensaje, String remitente, boolean esFavorito, List<String> destinatarios, List<Usuario> usuariosGrupo) {
        MandarMailRequest request = MandarMailRequest.newBuilder()
                .setTitulo(titulo)
                .setMensaje(mensaje)
                .setRemitente(remitente)
                .addAllDestinatarios(destinatarios)
                .setEsFavorito(esFavorito)
                .addAllUsuariosGrupo(usuariosGrupo)
                .build();
        try {
            // enviamos correo
            MandarMailResponse response = mailServiceStub.mandarMail(request);

            // mostrar estatus y detalle
            System.out.println("Estatus del envío: " + response.getStatus());
            System.out.println("Detalle: " + response.getDetalle());
        } catch (StatusRuntimeException e) {
            System.err.println("Error al enviar el correo: " + e.getStatus());
        }
    }

    public void consultarHistorialDeCorreos(String destinatario) {
        ConsultarCorreosRequest request = ConsultarCorreosRequest.newBuilder()
                .setDestinatario(destinatario)
                .build();
        try {
            ConsultarCorreosResponse response = mailServiceStub.consultarCorreos(request);
            System.out.println("\n=== Historial de correos recibidos por " + destinatario + " ===");
            for (MandarMailRequest correo : response.getCorreosList()) {
                System.out.println("- Título: " + correo.getTitulo());
                System.out.println("  Mensaje: " + correo.getMensaje());
                System.out.println("  Remitente: " + correo.getRemitente());
                System.out.println("  Favorito: " + (correo.getEsFavorito() ? "Sí" : "No"));
                System.out.println();
            }
        } catch (StatusRuntimeException e) {
            System.err.println("Error al consultar correos: " + e.getStatus());
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Uso: <correo_cliente> <modo (remitente|destinatario)>");
            return;
        }

        String correoCliente = args[0];
        String modo = args[1];
        MailClient client = new MailClient("192.168.0.72", 50051, correoCliente);

        if ("remitente".equalsIgnoreCase(modo)) {
            ejecutarComoRemitente(client, correoCliente);
        } else if ("destinatario".equalsIgnoreCase(modo)) {
            ejecutarComoDestinatario(client, correoCliente);
        } else {
            System.err.println("Modo no válido. Use 'remitente' o 'destinatario'.");
        }
    }

    private static void ejecutarComoRemitente(MailClient client, String remitente) {
        System.out.println("=== Modo Remitente ===");
        String titulo = "Correo automático";
        String mensaje = "Este es un correo enviado automáticamente desde " + remitente;

        // Destinatarios a los que se enviarán correos
        List<String> destinatarios = List.of("nacho@gmail.com", "lourdes@gmail.com");
        boolean esFavorito = false;

        // Usuarios en grupo (opcional)
        List<Usuario> usuariosGrupo = new ArrayList<>();

        // Enviar el correo
        client.enviarCorreo(titulo, mensaje, remitente, esFavorito, destinatarios, usuariosGrupo);
    }

    private static void ejecutarComoDestinatario(MailClient client, String destinatario) {
        System.out.println("=== Modo Destinatario ===");
        client.consultarHistorialDeCorreos(destinatario);
    }
}
