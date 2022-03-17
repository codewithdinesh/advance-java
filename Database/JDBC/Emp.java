package Database.JDBC;
import java.sql.*;

public class Emp {
    public static void main(String[] args) {
        try {

            // driver load
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loaded Successfully");

            // connection
            Connection c = DriverManager.getConnection("jdbc:odbc:Program1"); 
            System.out.println("Connection Created");

            // Query
            String sql = "insert into Emp(Id,EName,Salary) values(?,?,?)";

            // Create Statement
            PreparedStatement ps = c.prepareStatement(sql);

            ps.setInt(1, 12);
            ps.setString(2, "Ramesh");
            ps.setInt(3, 12000);
            ps.executeUpdate();

            ps.setInt(1, 26);
            ps.setString(2, "Ram");
            ps.setInt(3, 5000);
            ps.executeUpdate();

            ps.setInt(1, 45);
            ps.setString(2, "Priya");
            ps.setInt(3, 8000);

            // execute query
            ps.executeUpdate();
            System.out.println("Row Inserted ");

            ps.close();

            // close connection session
            c.close();

        } catch (SQLException e) {
            System.out.print("SQL Query Expection " + e);

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found" + e);

        }
    }
}