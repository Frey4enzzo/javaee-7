package org.book.chapter08.ex4_security_programm;

import org.book.chapter08.ex3_security_declar.*;
import org.book.chapter08.ex3_security_declar.CD;

import javax.annotation.Resource;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alexey on 09.09.2017.
 */

@Stateless
public class ItemEJB {

    @PersistenceContext(unitName = "chapter08")
    private EntityManager em;

    @Resource
    private SessionContext ctx; // ссылка на контекст компонента

    public List<Book> findAllBooks() {
        return em.createNamedQuery(Book.FIND_ALL, Book.class).getResultList();
    }

    public List<CD> findAllCDs(){
        return em.createNamedQuery("CD.findAllCDs", CD.class).getResultList();
    }


    public Book findBookById(Long id) {
        return em.find(Book.class, id);
    }

    @PermitAll
    public CD findCDById(Long id) {
        return em.find(CD.class, id);
    }

    public Book createBook(Book book) {
        if (ctx.isCallerInRole("employee") && !ctx.isCallerInRole("admin")) {
            book.setCreatedBy("employee only");
        } else if (ctx.getCallerPrincipal().getName().equals("paul")) {
            book.setCreatedBy("special user");
        }
        em.persist(book);
        return book;
    }

    public CD createCD(CD cd) {
        em.persist(cd);
        return cd;
    }

    public void deleteBook(Book book) {
        if (!ctx.isCallerInRole("admin")) {
            throw new SecurityException("Only admins are allowed");
        }
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

}
