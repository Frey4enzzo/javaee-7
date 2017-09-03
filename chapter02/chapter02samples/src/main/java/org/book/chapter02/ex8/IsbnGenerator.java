package org.book.chapter02.ex8;


import javax.inject.Inject;
import java.util.logging.Logger;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator{

    @Inject @ThirteenDigits
    private String prefix;

    @Inject @ThirteenDigits
    private int editorNumber;

    @Inject @Random
    private double postfix;

    public String generateNumber() {
        return prefix + editorNumber + postfix;
    }
}
