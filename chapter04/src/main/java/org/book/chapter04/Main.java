package org.book.chapter04;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // передаем имя единицы сохраняемости в качестве параметра для коннекта с БД
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("chapter04");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        // Обуспечение постоянства book в БД
//        tx.begin();
//
//        tx.commit();

        // находим книгу по id
        Book book = em.find(Book.class, 3L);
        System.out.println(book);

        System.out.println("---- USING NAMED QUERY ----");

        List<Book> books = em.createNamedQuery("findAllBooks", Book.class).getResultList();

        books.stream().forEach((v) -> System.out.println(v));
        System.out.println("------");
        book = em.createNamedQuery("findBookH2G2", Book.class).getSingleResult();
        System.out.println(book);

        em.close();
        emf.close();
    }
}
