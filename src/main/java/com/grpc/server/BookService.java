package com.grpc.server;

import com.grpc.common.BookOuterClass.*;
import com.grpc.common.BookServicesGrpc.*;
import io.grpc.stub.StreamObserver;

public class BookService extends BookServicesImplBase {

    public void bookById(BookId bookId, StreamObserver<Book> responseObserver) {

        BookId  id = BookId.newBuilder().setId(1234).build();
        Book book = Book.newBuilder().setId(id).setName("abcd").setPageCount(100).build();
        responseObserver.onNext(book);
        responseObserver.onCompleted();
    }


    public void findAllBooks(BookId request, StreamObserver<Book> responseObserver) {
        try {


            BookId id = BookId.newBuilder().setId(1234).build();
            Book book = Book.newBuilder().setId(id).setName("abcd").setPageCount(100).build();
            responseObserver.onNext(book);
            Thread.sleep(3000);
            responseObserver.onNext(book);
            Thread.sleep(3000);
            responseObserver.onNext(book);
            Thread.sleep(3000);
            responseObserver.onCompleted();
        } catch (Exception e) {
            return;

        }
    }

}