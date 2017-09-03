package org.book.chapter02.ex6_manyinone_qualifier;

import java.util.Random;

@NumberOfDigits(value = Digits.EIGHT, odd = true)
public class IssnGenerator implements NumberGenerator{

    public String generateNumber() {
        return "8-" + Math.abs(new Random().nextInt());
    }
}
