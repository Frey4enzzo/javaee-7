package org.book.chapter02.ex2;

/**
 * Связывание BookService с ISBN реализацией NumberGenerator в конструкторе
 */

public class BookService {

    private NumberGenerator numberGenerator;

    public BookService(NumberGenerator numberGenerator) {
        this.numberGenerator = new IsbnGenerator();
    }

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}
