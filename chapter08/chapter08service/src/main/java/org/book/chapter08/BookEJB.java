package org.book.chapter08;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Сеансовый компонент не сохраняющий состояние, который действует как фасад (паттерн facade ?)
 */

@Stateless
@LocalBean
public class BookEJB implements BookEJBRemote{

    @Inject
    private EntityManager em;

    public List<Book> findAllBooks() {
        return em.createNamedQuery(Book.FIND_ALL, Book.class).getResultList();
    }

    public
    @NotNull
    Book createBook(@NotNull Book book) {
        em.persist(book);
        return book;
    }

    public void deleteBook(@NotNull Book book) {
        em.remove(em.merge(book));
    }

    public
    @NotNull
    Book updateBook(@NotNull Book book) {
        return em.merge(book);
    }
}
