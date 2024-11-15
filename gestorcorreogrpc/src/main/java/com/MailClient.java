package com;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.ArrayList;
import java.util.List;

public class MailClient {
    private final MailServiceGrpc.MailServiceBlockingStub mailServiceStub;
    private final String destinatario;

    public MailClient(String host, int port, String destinatario) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.mailServiceStub = MailServiceGrpc.newBlockingStub(channel);
        this.destinatario = destinatario;
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
            // Enviar el correo
            MandarMailResponse response = mailServiceStub.mandarMail(request);
            System.out.println("Estatus del envío: " + response.getStatus());
            System.out.println("Detalle: " + response.getDetalle());

            // Mostrar correo recibido en el cliente correspondiente
            System.out.println("Correo recibido por " + destinatario + ":");
            System.out.println("Título: " + titulo);
            System.out.println("Mensaje: " + mensaje);
            System.out.println("Remitente: " + remitente);
        } catch (StatusRuntimeException e) {
            System.err.println("Error al enviar el correo: " + e.getStatus());
        }
    }

    public static void main(String[] args) {
        String host = "localhost";
        int port = 50051;

        if (args.length < 1) {
            System.err.println("Especifique el destinatario como argumento.");
            return;
        }

        String destinatario = args[0];
        MailClient client = new MailClient(host, port, destinatario);

        String titulo = "Prueba de Correo";
        String mensaje = "Este es un mensaje de prueba.";
        String remitente = "remitente@ejemplo.com";
        
        List<String> destinatarios = new ArrayList<>();
        destinatarios.add(destinatario);

        boolean esFavorito = false;

        // Añadir usuarios al grupo
        ArrayList<Usuario> usuariosGrupo = new ArrayList<>();
        usuariosGrupo.add(Usuario.newBuilder().setNombre("Lourdes").setApellido("Gomez").setDireccionCorreo("lourdes@gmail.com").build());
        usuariosGrupo.add(Usuario.newBuilder().setNombre("Juani").setApellido("Perez").setDireccionCorreo("juani@gmail.com").build());

        client.enviarCorreo(titulo, mensaje, remitente, esFavorito, destinatarios, usuariosGrupo);
    }
}
