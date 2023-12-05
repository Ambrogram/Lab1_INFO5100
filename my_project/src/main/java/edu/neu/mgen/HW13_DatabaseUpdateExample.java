package edu.neu.mgen;

// Importing required JDBC classes for database connectivity and operations.

/**
 * 
 *  import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.sql.SQLException;
 * public class HW13_DatabaseUpdateExample {
    public static void main(String[] args) {
        try {
            // Loading the JDBC driver for the database (example for MySQL).
            // This line is optional for newer versions of JDBC drivers.
            //Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing a connection to the database.
            // Replace with your database's URL, username, and password.
            String url = "jdbc:mysql://localhost:3306/world";
            String username = "yourUsername";
            String password = "yourPassword";
            Connection conn = DriverManager.getConnection(url, username, password);

            // Setting auto-commit to false for transaction management.
            conn.setAutoCommit(true);

            // Creating a Statement object to execute SQL queries.
            Statement stmt = conn.createStatement();

            // Executing a SQL query to read a single record from a table.
            
            String query = "SELECT * FROM user LIMIT 1";
            ResultSet rs = stmt.executeQuery(query);

            // Variables to hold the data from the database.
            int UserID = 50;
            String name = "User50";

            // Processing the result set to retrieve data.
            if (rs.next()) {
                UserID = rs.getInt("USerID");  //  the table has an 'USerID' column.
                name = rs.getString("name");  //  the table has a 'name' column.
            }

            // Modifying the data retrieved from the database.
            name = "John"; // modification.

            // Preparing the SQL update statement with the modified data.
            String updateQuery = "UPDATE yourTable SET name = '" + name + "' WHERE UserID = " + UserID;

            // Executing the update statement to modify the record in the database.
            stmt.executeUpdate(updateQuery);

            // Rolling back the transaction to restore the original state.
            conn.rollback();

            // Closing the ResultSet, Statement, and Connection to free resources.
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Handling exceptions for JDBC driver loading.
        } catch (SQLException e) {
            e.printStackTrace(); // Handling SQL related exceptions.
        }
    }
}
 */



// Import required classes for SQL operations and handling exceptions.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class HW13_DatabaseUpdateExample {
    public static void main(String[] args) {
        try {
            // Establish a connection to the database using JDBC.
            String url = "jdbc:mysql://localhost:3306/world"; // URL of the database.
            String username = "yourUsername"; // Username for database login.
            String password = "yourPassword"; // Password for database login.
            Connection conn = DriverManager.getConnection(url, username, password); // Get connection object.

            // Set auto-commit to false to manage transactions manually.
            conn.setAutoCommit(false); // If true, each SQL statement is committed upon completion.

            // Create a Statement object to facilitate SQL query execution.
            Statement stmt = conn.createStatement(); // Used to execute SQL statements.

            // Define a SQL query to retrieve data.
            String query = "SELECT * FROM user LIMIT 1"; // SQL query to select data.
            ResultSet rs = stmt.executeQuery(query); // Execute the query and get the result set.

            // Initialize variables to store data retrieved from the database.
            int UserID = 50; // Default user ID.
            String name = "User50"; // Default name.

            // Process the result set to retrieve and store data.
            if (rs.next()) { // Check if there is data in the result set.
                UserID = rs.getInt("UserID"); // Get user ID from the result set.
                name = rs.getString("name"); // Get name from the result set.
            }

            // Modify the retrieved data.
            name = "John"; // Update the name value.

            // Prepare an SQL update statement with the modified data.
            String updateQuery = "UPDATE yourTable SET name = '" + name + "' WHERE UserID = " + UserID; // SQL update statement.

            // Execute the update statement to modify the record in the database.
            stmt.executeUpdate(updateQuery); // Execute the update query.

            // Commit the transaction to finalize changes.
            conn.commit(); // Commit changes if manual transaction management is used.

            // Close the ResultSet, Statement, and Connection to release resources.
            rs.close(); // Close the result set.
            stmt.close(); // Close the statement object.
            conn.close(); // Close the database connection.
        } catch (SQLException e) {
            e.printStackTrace(); // Handle and print details of any SQL-related exceptions.
        }
    }
}
