package org.book.chapter07.ex_6;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Alexey on 09.09.2017.
 */
@Local
public interface ItemLocal {

    List<Book> findAllBooks();
}
