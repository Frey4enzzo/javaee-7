package org.book.chapter02.ex9_connectionjdbc;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

@ApplicationScoped // область видимости приложения
public class TestJDBCService {

    @Inject
    Logger logger;

    @Inject
    private Connection connection;


    public void test() throws SQLException {
        connection.createStatement().executeQuery("SELECT * FROM department");
        logger.info("Connection successfully");
    }

}
