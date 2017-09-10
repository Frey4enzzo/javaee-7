package org.book.chapter08;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Alexey on 09.09.2017.
 */

public interface BookEJBRemote {

    List<Book> findAllBooks();

    @NotNull Book createBook(@NotNull Book book);

    void deleteBook(@NotNull Book book);

    @NotNull Book updateBook(@NotNull Book book);
}
