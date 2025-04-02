import java.sql.*;

public class JdbcCRUD {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";  // Database URL
        String user = "root";  // MySQL Username
        String password = "password";  // MySQL Password

        try {
            // 1️⃣ Load MySQL JDBC Driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Establish Database Connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // 3️⃣ Perform CRUD Operations
            createStudent(con, "Alice", 22);  // Create
            readStudents(con);  // Read
            updateStudent(con, 1, "Alice Smith");  // Update
            deleteStudent(con, 1);  // Delete

            // 4️⃣ Close the Connection
            con.close();
            System.out.println("Connection closed.");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CREATE operation (Insert a student into the database)
    public static void createStudent(Connection con, String name, int age) throws SQLException {
        String query = "INSERT INTO students (name, age) VALUES (?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Student added successfully!");
        }
        pstmt.close();
    }

    // READ operation (Retrieve and display all students)
    public static void readStudents(Connection con) throws SQLException {
        String query = "SELECT * FROM students";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println("Student List:");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
        }
        rs.close();
        stmt.close();
    }

    // UPDATE operation (Modify an existing student's name)
    public static void updateStudent(Connection con, int id, String newName) throws SQLException {
        String query = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, newName);
        pstmt.setInt(2, id);
        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Student updated successfully!");
        }
        pstmt.close();
    }

    // DELETE operation (Remove a student from the database)
    public static void deleteStudent(Connection con, int id) throws SQLException {
        String query = "DELETE FROM students WHERE id = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);
        int rowsDeleted = pstmt.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Student deleted successfully!");
        }
        pstmt.close();
    }
}
