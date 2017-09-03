package org.book.chapter02.ex8;


import javax.inject.Inject;

public class IssnGenerator implements NumberGenerator{

    @Inject
    @EightDigits
    private String prefix;

    @Inject
    @Random
    private double postfix;

    public String generateNumber() {
        return prefix + postfix;
    }
}
