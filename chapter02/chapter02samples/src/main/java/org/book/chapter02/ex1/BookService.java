package org.book.chapter02.ex1;


/**
 * Компонент CDI
 */

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Date;

public class BookService {

    @Inject  // недрение ссылки на другой компонент
    private NumberGenerator numberGenerator;

    @Inject
    private EntityManager em;
    private Date instanciationDate;

    @PostConstruct   // контейнер управляет жизненным циклом
    private void initDate() {
        instanciationDate = new Date();
    }

    @Transactional
    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        book.setInstanciationDate(instanciationDate);
        em.persist(book);
        return book;
    }

}
