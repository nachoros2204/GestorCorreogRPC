package com;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.List;

public class MailClient {
    private final MailServiceGrpc.MailServiceBlockingStub mailServiceStub;

    public MailClient(String host, int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        mailServiceStub = MailServiceGrpc.newBlockingStub(channel);
    }

    public void enviarCorreo(String titulo, String mensaje, String remitente, List<String> destinatarios, boolean esFavorito, List<Usuario> usuariosGrupo) {
        MandarMailRequest request = MandarMailRequest.newBuilder()
                .setTitulo(titulo)
                .setMensaje(mensaje)
                .setRemitente(remitente)
                .addAllDestinatarios(destinatarios)
                .setEsFavorito(esFavorito)
                .addAllUsuariosGrupo(usuariosGrupo)
                .build();
        try {
            MandarMailResponse response = mailServiceStub.mandarMail(request);
            System.out.println("Estatus del envío: " + response.getStatus());
            System.out.println("Detalle: " + response.getDetalle());
        } catch (StatusRuntimeException e) {
            System.err.println("Error al enviar el correo: " + e.getStatus());
        }
    }
}
