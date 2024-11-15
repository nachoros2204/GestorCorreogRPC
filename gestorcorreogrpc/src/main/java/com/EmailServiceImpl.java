package com;

import io.grpc.stub.StreamObserver;

public class EmailServiceImpl extends MailServiceGrpc.MailServiceImplBase {

    @Override
    public void mandarMail(MandarMailRequest request, StreamObserver<MandarMailResponse> responseObserver) {
        
        String titulo = request.getTitulo();
        String mensaje = request.getMensaje();
        String remitente = request.getRemitente();
        boolean esFavorito = request.getEsFavorito();
        
        System.out.println("=== Enviando Correo ===");
        System.out.println("Título: " + titulo);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Remitente: " + remitente);

        // Envío a destinatarios individuales
        if (!request.getDestinatariosList().isEmpty()) {
            for (String destinatario : request.getDestinatariosList()) {
                System.out.println("Correo enviado a destinatario individual: " + destinatario);
            }
        }

        // Envío a grupo de usuarios
        if (request.getUsuariosGrupoCount() > 0) {
            System.out.println("Enviando correo a grupo de usuarios:");
            for (Usuario usuario : request.getUsuariosGrupoList()) {
                System.out.println("Usuario: " + usuario.getNombre() + " " + usuario.getApellido() +
                                   ", Correo: " + usuario.getDireccionCorreo());
            }
        }

        MandarMailResponse response = MandarMailResponse.newBuilder()
                .setStatus("Enviado")
                .setDetalle("Correo enviado exitosamente.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
