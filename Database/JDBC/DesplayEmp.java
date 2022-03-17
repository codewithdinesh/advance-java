package Database.JDBC;
import java.sql.*;

public class DesplayEmp {
    public static void main(String[] args) {

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loaded Successfully");

            Connection c = DriverManager.getConnection("jdbc:odbc:Program1");
            System.out.println("Connection Created");

            String sql = "select * from Emp";

            Statement ps = c.createStatement();

            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {

                System.out.println("ID :" + rs.getInt(1) + "\t EName: " + rs.getString(2) + "\t Salary: " + rs.getInt(3));

            }

            rs.close();

            c.close();

        } catch (SQLException e) {
            System.out.print("SQL Query Expection " + e);
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found" + e);

        }
    }

}
