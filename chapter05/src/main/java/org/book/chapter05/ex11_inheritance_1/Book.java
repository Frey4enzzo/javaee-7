package org.book.chapter05.ex11_inheritance_1;

import javax.persistence.Entity;

/**
 *
 */

@Entity
public class Book extends Item {

    private String isbn;
    private String publisher;
    private Boolean illustrations;

    public Book(){}

    public Book(String title, Double price, String description, String isbn, String publisher, Boolean illustrations) {
        super(title, price, description);
        this.isbn = isbn;
        this.publisher = publisher;
        this.illustrations = illustrations;
    }
}
