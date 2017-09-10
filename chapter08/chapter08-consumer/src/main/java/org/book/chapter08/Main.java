package org.book.chapter08;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

/**
 * Created by Alexey on 09.09.2017.
 */

public class Main {
    public static void main(String[] args) throws NamingException {

        Context ctx = new InitialContext();

        BookEJBRemote bookEJB = (BookEJBRemote) ctx.lookup("java:global/chapter08-service-1.0/BookEJB!org.book.javaee.chapter08.BookEJBRemote");

        bookEJB.findAllBooks().stream().forEach((book -> System.out.println("--- " + book)));

    }
}
