package Database.JDBC;
import java.sql.*;

public class DeleteEmp {
    public static void main(String[] args) {
        try {

        
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loaded Successfully");

       
            Connection c = DriverManager.getConnection("jdbc:odbc:Program1"); 
            System.out.println("Connection Created");

           
            String sql = "Delete From Emp where EName='Ram'";

   
            Statement ps = c.createStatement();

            ps.executeUpdate(sql);
            System.out.println("Deletion  done");


            c.close();

        } catch (SQLException e) {
            System.out.print("SQL Query Expection " + e);

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found" + e);

        }
    }
}
