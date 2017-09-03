package org.book.chapter02;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator{

    @Inject
    private Logger logger;

    public String generateNumber() {
        String isbn = "13-12345-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN: " + isbn);
        return isbn;
    }
}
