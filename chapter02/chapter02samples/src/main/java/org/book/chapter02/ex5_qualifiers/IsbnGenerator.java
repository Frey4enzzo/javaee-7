package org.book.chapter02.ex5_qualifiers;


import java.util.Random;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {

    public String generateNumber() {
        return "12-34567-" + Math.abs(new Random().nextInt());
    }
}
