package org.book.chapter02.ex3;

import javax.inject.Inject;

/**
 * Аннотация @Inject у атрибута сообщит
 * контейнеру, что ему необходимо внедрить ссылку на реализацию NumberGenerator,
 * относящуюся к свойству NumberGenerator
 */

public class BookService {

    @Inject  // используем @Inject для получения ссылки на NumberGenerator. Точка внедрения
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}
