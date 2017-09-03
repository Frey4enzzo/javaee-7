package org.book.chapter02.ex8;


import javax.inject.Inject;
import java.util.logging.Logger;

public class BookService {

    @Inject
    Logger logger;

    @Inject
    @ThirteenDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}
