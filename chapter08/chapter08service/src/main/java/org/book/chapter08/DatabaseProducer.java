package org.book.chapter08;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Alexey on 09.09.2017.
 */

public class DatabaseProducer {

    @Produces
    @PersistenceContext(unitName = "chapter08")
    private EntityManager em;
}
