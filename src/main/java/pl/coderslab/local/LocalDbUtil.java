package pl.coderslab.local;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocalDbUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop3";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}
