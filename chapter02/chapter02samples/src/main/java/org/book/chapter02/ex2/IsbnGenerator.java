package org.book.chapter02.ex2;


import java.util.Random;

public class IsbnGenerator implements NumberGenerator{


    public String generateNumber() {
        return "12-34567-" + Math.abs(new Random().nextInt());
    }
}
