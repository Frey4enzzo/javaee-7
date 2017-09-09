package org.book.chapter07.ex2_withoutstate;

import javax.ejb.Local;
import java.util.List;

/**
 * Локальный интерфейс, реализуемый сессионным EJB-компонентом без сохранения состояния ItemEJB
 */

@Local
public interface ItemLocal {

    List<Book> findBooks();

    List<CD> findCDs();
}
