package org.book.chapter02.ex6_manyinone_qualifier;

import java.util.Random;

@NumberOfDigits(value = Digits.THIRTEEN, odd = false)
public class IsbnEvenGenerator implements NumberGenerator{

    public String generateNumber() {
        return "132-84356-" + Math.abs(new Random().nextInt());
    }
}
