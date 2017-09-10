package org.book.chapter08.ex3_security_declar;

import javax.annotation.security.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * ДЕКЛАРАТИВНАЯ АВТОРИЗАЦИЯ
 * При развертывании класса объявляются пять ролей.
 */

@Stateless
@DeclareRoles({"HR", "salesDpt"})  // декларирует роли для всего приложения
@RolesAllowed({"user", "employee", "admin"})
// @RunAs("inventoryDpt")  // временная роль
public class ItemEJB {

    @PersistenceContext(unitName = "chapter08")
    EntityManager em;

    public List<Book> findAllBooks() {
        return em.createNamedQuery(Book.FIND_ALL, Book.class).getResultList();
    }

    public List<CD> findAllCDs(){
        return em.createNamedQuery("CD.findAllCDs", CD.class).getResultList();
    }

    @PermitAll
    public Book findBookById(Long id) {
        return em.find(Book.class, id);
    }

    @PermitAll
    public CD findCDById(Long id) {
        return em.find(CD.class, id);
    }

    @RolesAllowed({"admin", "employee"})
    public Book createBook(Book book) {
        em.persist(book);
        return book;
    }

    public CD createCD(CD cd) {
        em.persist(cd);
        return cd;
    }

    @RolesAllowed({"admin"})
    public void deleteBook(Book book) {
        em.remove(em.merge(book));
    }

    public void deleteCD(CD cd) {
        em.remove(em.merge(cd));
    }

    public Book updateBook(Book book) {
        em.merge(book);
        return book;
    }

    public CD updateCD(CD cd) {
        em.merge(cd);
        return cd;
    }

    @DenyAll
    public Book findConfidentialBook(Long secureId) {
        return em.find(Book.class, secureId);
    }
}
