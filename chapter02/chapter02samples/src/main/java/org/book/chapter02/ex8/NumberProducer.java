package org.book.chapter02.ex8;


import javax.enterprise.inject.Produces;
import java.util.Random;

public class NumberProducer {

    @Produces @ThirteenDigits
    private String prefix13digits = "13-";

    @Produces @ThirteenDigits
    private int editorNumber = 84356;

    @Produces @EightDigits
    private String prefix8digits = "8-";

    // метод производителя данных - выступает в качестве фабрики экземпляров компонентов
    @Produces @org.book.chapter02.ex8.Random
    public double random() {
        return Math.abs(new Random().nextInt());
    }
}
