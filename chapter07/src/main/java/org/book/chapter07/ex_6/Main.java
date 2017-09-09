package org.book.chapter07.ex_6;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alexey on 09.09.2017.
 */
public class Main {
    public static void main(String[] args) throws NamingException {

        Map<String, Object> properties = new HashMap<>();
        properties.put(EJBContainer.MODULES, new File("target/classes"));
        
        try (EJBContainer ec = EJBContainer.createEJBContainer(properties)) {

            Context ctx = ec.getContext();
            
            Book book = new Book();
            book.setTitle("Java. Библиотека профессионала");
            book.setPrice(35.49);
            book.setDescription("Книга для изчения программирование на Java");
            book.setIsbn("1-84158-258-2");
            book.setNbOfPage(864);
            book.setIllustrations(true);
            
            
            ItemEJB itemEJB = (ItemEJB) ctx.lookup("java:global/classes/ItemEJB!org.book.javaee.chapter07.ex_6.ItemEJB");
            
            itemEJB.createBook(book);

            itemEJB.findAllBooks().stream().forEach(i -> System.out.println(i));
        }
    }
}
