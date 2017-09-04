package org.book.chapter04;

/**
 * Book - сущность - аннотированный POJO управляемый поставщиком постоянства
 */

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
        @NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b"),
        @NamedQuery(name = "findBookH2G2", query = "SELECT b FROM Book b WHERE b.title = 'H2G2'")
})
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String title;
    private Double price;
    @Size(min = 10, max = 2000)
    private String description;
    private String isbn;
    private Integer nbOfPage;
    private boolean illustrations;

    public Book() {
    }

    public Book(String title, Double price, String description, String isbn, Integer nbOfPage, boolean illustrations) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.isbn = isbn;
        this.nbOfPage = nbOfPage;
        this.illustrations = illustrations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    public boolean isIllustrations() {
        return illustrations;
    }

    public void setIllustrations(boolean illustrations) {
        this.illustrations = illustrations;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Book");
        sb.append("{id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", price=").append(price);
        sb.append(", description='").append(description).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", nbOfPage=").append(nbOfPage);
        sb.append(", illustrations=").append(illustrations);
        sb.append('}');
        return sb.toString();
    }
}
