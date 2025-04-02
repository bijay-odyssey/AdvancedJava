import java.sql.*;  // Import JDBC API classes

public class JdbcExample {
    public static void main(String[] args) throws Exception {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection to MySQL database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");

        // Create a Statement object
        Statement stmt = con.createStatement();

        // Execute a SELECT query and get the result set
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        // Iterate over the result set
        while (rs.next()) {
            System.out.println(rs.getString("name"));  // Print the 'name' column from the 'students' table
        }

        // Close the resources
        rs.close();
        stmt.close();
        con.close();
    }
}
