package org.book.chapter02.ex2;

public class Main {
    public static void main(String[] args) {

        /**
         * Иллюстрация инверсии управления: инвертируется управление
         * созданием зависимости между BookService и NumberGenerator,
         * т.к. оно отдается внешнему классу. КОНСТРУИРОВАНИЕ ВРУЧНУЮ
         */
        BookService service = new BookService(new IsbnGenerator());
        BookService serviceISSN = new BookService(new IssnGenerator());

        Book book = service.createBook("Title", 5.49F, "Test Book");
        Book book1 = serviceISSN.createBook("Title1", 5.49F, "Test5145 Book");

        System.out.println(book);

    }
}
