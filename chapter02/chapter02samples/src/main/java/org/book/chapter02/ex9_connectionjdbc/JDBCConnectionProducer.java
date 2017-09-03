package org.book.chapter02.ex9_connectionjdbc;


import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionProducer {

    @Produces
    private Connection createConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://93.123.142.44:3306/juntest",
                    "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    // метод утилизатора
    private void closeConnection(@Disposes Connection connection) throws SQLException {
        connection.close();
    }
}
