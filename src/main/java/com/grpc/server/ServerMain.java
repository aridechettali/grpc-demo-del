package com.grpc.server;

import com.grpc.server.service.BookService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
public class ServerMain
{
    public static void main( String[] args ) throws Exception {
        System.out.println("GRPC Server Starting");
        Server server = ServerBuilder.forPort(9090).addService(new BookService()).build();
        server.start();
        System.out.println("GRPC Server started at " + server.getPort());
        server.awaitTermination();
    }
}