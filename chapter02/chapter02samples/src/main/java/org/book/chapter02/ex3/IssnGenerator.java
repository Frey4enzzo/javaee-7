package org.book.chapter02.ex3;

import java.util.Random;

public class IssnGenerator implements NumberGenerator {

    public String generateNumber() {
        return "1-" + Math.abs(new Random().nextInt());
    }
}
