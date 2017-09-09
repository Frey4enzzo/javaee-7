package org.book.chapter07.ex_6;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alexey on 09.09.2017.
 */

@Stateless
@LocalBean
public class ItemEJB implements ItemLocal, ItemRemote {

    @PersistenceContext(name = "chapter07")
    private EntityManager em;

    @Override
    public List<Book> findAllBooks() {
        return em.createNamedQuery(Book.FIND_ALL, Book.class).getResultList();
    }

    @Override
    public Book createBook(Book book) {
        em.persist(book);
        return book;
    }
}
