package com;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.ArrayList;
import java.util.List;

public class MailClient {
    private final MailServiceGrpc.MailServiceBlockingStub mailServiceStub;

    public MailClient(String host, int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        mailServiceStub = MailServiceGrpc.newBlockingStub(channel);
    }

    public void enviarCorreo(String titulo, String mensaje, String remitente, ArrayList<String> destinatarios, boolean esFavorito, ArrayList<Usuario> usuariosGrupo) {
        MandarMailRequest request = MandarMailRequest.newBuilder()
                .setTitulo(titulo)
                .setMensaje(mensaje)
                .setRemitente(remitente)
                .addAllDestinatarios(destinatarios)
                .setEsFavorito(esFavorito)
                .addAllUsuariosGrupo(usuariosGrupo)
                .build();
        try {
            // Imprimir destinatarios individuales
            System.out.println("Enviando correo a los siguientes destinatarios individuales:");
            for (String destinatario : destinatarios) {
                System.out.println("- " + destinatario);
            }

            // Imprimir destinatarios de grupo
            System.out.println("Enviando correo a los siguientes destinatarios en grupo:");
            for (Usuario usuario : usuariosGrupo) {
                System.out.println("- " + usuario.getNombre());
            }

            // Enviar el correo
            MandarMailResponse response = mailServiceStub.mandarMail(request);
            System.out.println("Estatus del envío: " + response.getStatus());
            System.out.println("Detalle: " + response.getDetalle());
        } catch (StatusRuntimeException e) {
            System.err.println("Error al enviar el correo: " + e.getStatus());
        }
    }

    public static void main(String[] args) {
        String host = "192.168.0.72";
        int port = 50051;

        MailClient client = new MailClient("192.168.0.72", 50051);

        String titulo = "Prueba de Correo";
        String mensaje = "Este es un mensaje de prueba.";
        String remitente = "remitente@ejemplo.com";
        
        List<String> destinatarios = new ArrayList<>();
        destinatarios.add("nacho@gmail.com");

        boolean esFavorito = false;

        //Añadir usuarios a la lista de grupo
        ArrayList<Usuario> usuariosGrupo = new ArrayList<>();
        usuariosGrupo.add(Usuario.newBuilder().setNombre("lourdes@gmail.com").build());
        usuariosGrupo.add(Usuario.newBuilder().setNombre("juani@gmail.com").build());

        client.enviarCorreo(titulo, mensaje, remitente, destinatarios, esFavorito, usuariosGrupo);
    }
}

