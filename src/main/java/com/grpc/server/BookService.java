package com.grpc.server;

import com.grpc.common.BookOuterClass.Book;
import com.grpc.common.BookOuterClass.BookId;
import com.grpc.common.BookServicesGrpc;

public class BookService  extends BookServicesGrpc.BookServicesImplBase {

    public void bookById(BookId bookId, Book responseObserver) {

    }
}