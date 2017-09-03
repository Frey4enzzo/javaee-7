package org.book.chapter02.ex6_manyinone_qualifier;

import java.util.Random;

@NumberOfDigits(value = Digits.THIRTEEN, odd = true)
public class IsbnOddGenerator implements NumberGenerator {
    public String generateNumber() {
        return "111-84356-" + Math.abs(new Random().nextInt());
    }
}
