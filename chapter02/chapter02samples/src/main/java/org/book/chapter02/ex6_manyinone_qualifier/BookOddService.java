package org.book.chapter02.ex6_manyinone_qualifier;


import javax.inject.Inject;

public class BookOddService {

    @Inject
    @NumberOfDigits(value = Digits.THIRTEEN, odd = true)
    NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}
