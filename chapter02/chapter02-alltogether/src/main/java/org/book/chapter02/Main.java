package org.book.chapter02;


import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        BookService service = container.instance().select(BookService.class).get();
        Book book = service.createBook("Olga's Book", 2.99, "About My Love");

        System.out.println(book);

        weld.shutdown();
    }
}
