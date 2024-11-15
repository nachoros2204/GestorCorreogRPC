package com;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class MailServer {
    private int port;
    private Server server;

    public MailServer(int port) {
        this.port = port;
        this.server = ServerBuilder.forPort(50051)
                .addService(new EmailServiceImpl())
                .build();
    }

    public void start() throws IOException {
        server.start();
        System.out.println("Servidor gRPC iniciado en el puerto: " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("Apagando el servidor gRPC...");
            MailServer.this.stop();
            System.err.println("Servidor apagado.");
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public void awaitTermination() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        MailServer server = new MailServer(50051);
        server.start();
        server.awaitTermination();
    }
}
