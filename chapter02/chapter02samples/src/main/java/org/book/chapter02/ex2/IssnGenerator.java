package org.book.chapter02.ex2;

import java.util.Random;

public class IssnGenerator implements NumberGenerator {

    public String generateNumber() {
        return "1-" + Math.abs(new Random().nextInt());
    }
}
