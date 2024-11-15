package com;

import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class EmailServiceImpl extends MailServiceGrpc.MailServiceImplBase {

    private final ConcurrentHashMap<String, List<MandarMailRequest>> correosPorDestinatario = new ConcurrentHashMap<>();

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

        // Almacenar correos para destinatarios individuales
        for (String destinatario : request.getDestinatariosList()) {
            correosPorDestinatario.putIfAbsent(destinatario, new ArrayList<>());
            correosPorDestinatario.get(destinatario).add(request);
            System.out.println("Correo enviado a destinatario individual: " + destinatario);
        }

        // Almacenar correos para usuarios en grupo
        for (Usuario usuario : request.getUsuariosGrupoList()) {
            String direccionCorreo = usuario.getDireccionCorreo();
            correosPorDestinatario.putIfAbsent(direccionCorreo, new ArrayList<>());
            correosPorDestinatario.get(direccionCorreo).add(request);
            System.out.println("Correo enviado a usuario del grupo: " + direccionCorreo);
        }

        MandarMailResponse response = MandarMailResponse.newBuilder()
                .setStatus("Enviado")
                .setDetalle("Correo enviado exitosamente.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void consultarCorreos(ConsultarCorreosRequest request, StreamObserver<ConsultarCorreosResponse> responseObserver) {
        String destinatario = request.getDestinatario();
        List<MandarMailRequest> correos = correosPorDestinatario.getOrDefault(destinatario, new ArrayList<>());

        ConsultarCorreosResponse.Builder responseBuilder = ConsultarCorreosResponse.newBuilder();
        responseBuilder.addAllCorreos(correos);

        System.out.println("=== Historial de correos consultado para " + destinatario + " ===");
        for (MandarMailRequest correo : correos) {
            System.out.println("Título: " + correo.getTitulo());
            System.out.println("Mensaje: " + correo.getMensaje());
            System.out.println("Remitente: " + correo.getRemitente());
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }
}

