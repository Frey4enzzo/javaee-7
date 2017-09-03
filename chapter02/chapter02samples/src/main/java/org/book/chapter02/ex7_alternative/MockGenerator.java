package org.book.chapter02.ex7_alternative;

import javax.enterprise.inject.Alternative;

/**
 * Альтернатива NumberGenerator по умолчанию
 */

@Alternative
public class MockGenerator implements NumberGenerator{

    public String generateNumber() {
        return "MOCK Generator";
    }
}
