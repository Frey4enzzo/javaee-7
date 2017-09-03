package org.book.chapter02.ex4_defaultinject;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

/** @Default — это встроенный квалификатор, сообщающий CDI, когда нужно вне-
* дрить реализацию компонента по умолчанию. Если вы определите компонент без
* квалификатора, ему автоматически присвоится квалификатор @Default
 */

public class BookService {

    @Inject
    @Default
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}
