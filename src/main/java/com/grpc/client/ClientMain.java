package com.grpc.client;

import com.grpc.generated.BookOuterClass.*;

import java.util.Iterator;

public class ClientMain {public static void main(String[] args) {

    BookServiceClient bookServiceClient = new BookServiceClient();


    Book book = bookServiceClient.getBookById(1234);
    System.out.println(book);

    Iterator<Book> books = bookServiceClient.findAllBooks();
    while(books.hasNext()) {
        System.out.println(books.next());
    }
}

}
