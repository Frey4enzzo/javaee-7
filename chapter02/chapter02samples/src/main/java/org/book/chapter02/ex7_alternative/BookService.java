package org.book.chapter02.ex7_alternative;


import javax.inject.Inject;

public class BookService {

    @Inject
    NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}
