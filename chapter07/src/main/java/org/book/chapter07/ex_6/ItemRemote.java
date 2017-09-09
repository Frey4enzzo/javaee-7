package org.book.chapter07.ex_6;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by Alexey on 09.09.2017.
 */

@Remote
public interface ItemRemote {

    List<Book> findAllBooks();

    Book createBook(Book book);
}
