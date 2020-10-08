package com.grpc.client;

import com.grpc.common.BookOuterClass.*;
import com.grpc.common.BookServicesGrpc;
import com.grpc.common.BookServicesGrpc.BookServicesBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.ExecutionException;

public class BookServiceClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();

        BookServicesBlockingStub bookServicesBlockingStub = BookServicesGrpc.newBlockingStub(channel);
        BookId id = BookId.newBuilder().setId(1234).build();
        Book book = bookServicesBlockingStub.bookById(id);
        System.out.println(book);
        
    }
}
