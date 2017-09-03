package org.book.chapter02.ex4_defaultinject;

import org.book.chapter02.ex3.IssnGenerator;

public class Main {
    public static void main(String[] args) {

        BookService service = new BookService();

        Book book = service.createBook("Title", 2F, "TestBook");

        System.out.println(book);

    }
}
