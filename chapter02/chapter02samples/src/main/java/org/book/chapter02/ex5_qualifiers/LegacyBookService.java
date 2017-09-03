package org.book.chapter02.ex5_qualifiers;


import javax.inject.Inject;

public class LegacyBookService {

    @Inject
    @EightDigits
    NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}
