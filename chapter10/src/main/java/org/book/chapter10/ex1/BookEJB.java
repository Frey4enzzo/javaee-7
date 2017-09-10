package org.book.chapter10.ex1;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class BookEJB {

    @PersistenceContext(unitName = "chapter10")
    private EntityManager em;

    public List<Book> findBooks() {
        return em.createNamedQuery("findAllBooks", Book.class).getResultList();
    }

    public Book createBook(Book book) {
        em.persist(book);
        return book;
    }
}
