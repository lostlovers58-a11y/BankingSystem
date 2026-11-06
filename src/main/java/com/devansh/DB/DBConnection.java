package com.devansh.DB;

import java.sql.*;

public class DBConnection {
    static final String url="jdbc:postgresql://localhost:5432/BankingSystem";
    static final String name="postgres";
    static final String password="Devansh@1";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,name,password);
    }

    public static void closeConnection(Connection connection, Statement statement) throws SQLException {
        connection.close();
        statement.close();
    }
}
