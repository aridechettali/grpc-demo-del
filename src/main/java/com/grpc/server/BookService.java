package com.grpc.server;

import com.grpc.common.BookOuterClass.Book;
import com.grpc.common.BookOuterClass.BookId;
import com.grpc.common.BookServicesGrpc;
import io.grpc.stub.StreamObserver;

public class BookService  extends BookServicesGrpc.BookServicesImplBase {

    public void bookById(BookId bookId, StreamObserver<Book> responseObserver) {

        BookId  id = BookId.newBuilder().setId(1234).build();
        Book book = Book.newBuilder().setId(id).setName("abcd").setPageCount(100).build();
        responseObserver.onNext(book);
        responseObserver.onCompleted();
    }
}