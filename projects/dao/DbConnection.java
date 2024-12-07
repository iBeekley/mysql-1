package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;


public class DbConnection {
    private static final String HOST = "localhost";
    private static final String PASSWORD = "Sidewaysmiata240!";
    private static final int PORT = 3306;
    private static final String SCHEMA = "projects";
    private static final String USER = "projects";
    
    public static Connection getConnection() throws DbException {
        String uri = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", HOST, PORT, SCHEMA);
        
        try {
            Connection connection = DriverManager.getConnection(uri, USER, PASSWORD);
            System.out.println("Connection successful.");
            return connection;
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
            throw new DbException("Could not connect to database", e);
        }
    }
}

