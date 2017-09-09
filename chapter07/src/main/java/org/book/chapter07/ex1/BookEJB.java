package org.book.chapter07.ex1;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.SynchronizationType;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class BookEJB {

    @PersistenceContext(unitName = "chapter07", synchronization = SynchronizationType.UNSYNCHRONIZED)
    private EntityManager em;

    public List<Book> findBooks() {
        TypedQuery<Book> query = em.createNamedQuery(Book.FIND_ALL, Book.class);
        em.joinTransaction();
        return query.getResultList();
    }

    public Book findBookById(Long id) {
        return em.find(Book.class, id);
    }

    public Book createBook(Book book) {
        em.persist(book);
        return book;
    }

    public void deleteBook(Book book) {
        em.remove(book);
    }

    public Book updateBook(Book book) {
        em.merge(book);
        return book;
    }
}
