package org.book.chapter02.ex4_defaultinject;


import javax.enterprise.inject.Default;
import java.util.Random;

@Default
public class IsbnGenerator implements NumberGenerator {

    public String generateNumber() {
        return "12-34567-" + Math.abs(new Random().nextInt());
    }
}
