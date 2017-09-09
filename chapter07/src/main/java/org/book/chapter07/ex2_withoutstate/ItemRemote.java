package org.book.chapter07.ex2_withoutstate;

import javax.ejb.Remote;
import java.util.List;

/**
 * Удаленный интерфейс, реализуемый сессионным EJB-компонентом без сохранения состояния ItemEJB
 * Параметры удаленного бизнес-интерфейса @Remote должны быть сериализуемыми
 */

@Remote
public interface ItemRemote {

    List<Book> findBooks();

    List<CD> findCDs();

    Book createBook(Book book);

    CD createCD(CD cd);
}
