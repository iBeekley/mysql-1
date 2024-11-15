package projects;

import java.sql.Connection;
import projects.dao.DbConnection; 

public class ProjectsApp {
    public static void main(String[] args) {
        try {
            Connection conn = DbConnection.getConnection();
            if (conn != null) {
                System.out.println("Connection success");
            } else {
                System.out.println("Failed to connect...");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}