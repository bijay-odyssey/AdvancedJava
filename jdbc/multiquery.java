import java.sql.*;

public class MultiResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test"; // Database URL
        String user = "root";  // Database username
        String password = "password";  // Database password

        String query = "SELECT id, name FROM users; SELECT id, product FROM orders;"; // Two queries

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            boolean hasResultSet = pstmt.execute();  // Execute the query

            while (hasResultSet) {
                try (ResultSet rs = pstmt.getResultSet()) {  // Get the current result set
                    ResultSetMetaData metaData = rs.getMetaData();
                    int columnCount = metaData.getColumnCount();  // Get column count

                    // Print column names
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(metaData.getColumnName(i) + "\t");
                    }
                    System.out.println();

                    // Print data
                    while (rs.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            System.out.print(rs.getString(i) + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println("-------------");
                }

                hasResultSet = pstmt.getMoreResults();  // Move to the next result set
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
