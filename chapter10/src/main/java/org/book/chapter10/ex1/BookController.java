package org.book.chapter10.ex1;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;

@Named
@RequestScoped
public class BookController {

    @Inject
    private BookEJB bookEJB;

    private Book book = new Book();
    private Date currentDate = new Date();

    public String doCreateBook() {
        book = bookEJB.createBook(book);
        return "listBooks.xhtml";
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}
