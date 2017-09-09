package org.book.chapter07.ex2_withoutstate;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * EJB-компонент БЕЗ СОХРАНЕНИЯ СОСТОЯНИЯ
 */

@Stateless // помечает объект как EJB-компонент без сохранения состояния
@LocalBean
//@Local(ItemLocal.class)
//@Local(ItemRemote.class)
public class ItemEJB implements ItemRemote, ItemLocal{

    @PersistenceContext(unitName = "chapter07")
    private EntityManager em;

    @Override
    public List<Book> findBooks() {
        return em.createNamedQuery(Book.FIND_ALL, Book.class).getResultList();
    }

    @Override
    public List<CD> findCDs() {
        return em.createNamedQuery(CD.FIND_ALL, CD.class).getResultList();
    }

    @Override
    public Book createBook(Book book) {
        em.persist(book);
        return book;
    }

    @Override
    public CD createCD(CD cd) {
        em.persist(cd);
        return cd;
    }
}
