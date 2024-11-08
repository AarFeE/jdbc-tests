package org.example.persistence.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url = "jdbc:postgresql://pg-22f065b4-andres-test.i.aivencloud.com:14305/defaultdb?ssl=require&user=avnadmin&password=AVNS_8DLgaMp69poVl6MqGuo";
    private static final String user = "avnadmin";
    private static final String password = "AVNS_8DLgaMp69poVl6MqGuo";

    private DatabaseConnection(){}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
