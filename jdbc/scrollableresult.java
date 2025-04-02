 import java.sql.*;
 public class ScrollableResultExample{
   public static void main(String[] args){
   String url="jdbc:mysql://localhost:3306/mydatabase";
   String user="root";
   String password="password";
   String sql="SELECT * FROM employees";
 
     try(Connection conn = DriverManager.getConnection(url,user,password);

         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         ResultSet rs = stmt.executeQuery(sql)) {
 
       //Movetothelastrow
       if (rs.last()){
         System.out.println("LastEmployeeID: "+rs.getInt("employee_id"));
 }
 
      //Movetothefirstrow
       if (rs.first()){
         System.out.println("FirstEmployeeID: "+rs.getInt("employee_id"));
 }
 
       //Movetoaspecificrow
       if (rs.absolute(2)){
         System.out.println("SecondEmployeeID: "+rs.getInt("employee_id"));
       }
 }catch(SQLExceptione){
       e.printStackTrace();
     }
   }
 }
