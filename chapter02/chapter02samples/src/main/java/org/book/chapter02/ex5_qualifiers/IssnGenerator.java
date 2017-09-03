package org.book.chapter02.ex5_qualifiers;

import java.util.Random;

@EightDigits
public class IssnGenerator implements NumberGenerator {

    public String generateNumber() {
        return "1-" + Math.abs(new Random().nextInt());
    }
}
