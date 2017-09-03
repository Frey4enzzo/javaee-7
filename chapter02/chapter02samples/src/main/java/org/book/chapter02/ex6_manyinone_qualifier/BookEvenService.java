package org.book.chapter02.ex6_manyinone_qualifier;


import javax.inject.Inject;

public class BookEvenService {

    @Inject
    @NumberOfDigits(value = Digits.THIRTEEN, odd = false)
    NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}
