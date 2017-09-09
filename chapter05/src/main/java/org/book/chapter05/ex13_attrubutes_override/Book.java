package org.book.chapter05.ex13_attrubutes_override;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Переименовываем стобцы
 */

@Entity
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "book_id")),
        @AttributeOverride(name = "title", column = @Column(name = "book_title")),
        @AttributeOverride(name = "description", column = @Column(name = "book_description"))
})
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
