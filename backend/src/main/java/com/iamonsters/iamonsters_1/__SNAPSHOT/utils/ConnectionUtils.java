package com.iamonsters.iamonsters_1.__SNAPSHOT.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtils {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "tftic@2026";

    public static Connection getConnection() throws Exception {

        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
