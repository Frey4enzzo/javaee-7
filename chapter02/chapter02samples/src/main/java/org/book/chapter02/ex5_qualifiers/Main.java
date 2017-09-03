package org.book.chapter02.ex5_qualifiers;


public class Main {
    public static void main(String[] args) {

        BookService service = new BookService();

        Book book = service.createBook("Title", 2F, "TestBook");

        System.out.println(book);
    }
}
