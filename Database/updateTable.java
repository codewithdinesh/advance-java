//insert 3 rows in tsud table

import java.sql.*;
import java.util.Scanner;

public class updateTable {
    public static void main(String[] args) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c = DriverManager.getConnection("jdbc:odbc:college");

            System.out.println("Enter the Following details");
            System.out.println("Enter Your name: ");

            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            

            String query="insert into stud values(?,?,?)";

            PreparedStatement ps=c.prepareStatement(query);
            ps.setInt(1, 10);
            ps.setString(2, name);
            ps.setInt(3, 81);
            ps.executeUpdate();

            //for 2nd row
            // ps.setInt(1, 13);
            // ps.setString(2, "Priya");
            // ps.setInt(3, 90);
            // ps.executeUpdate();

            //for 3rd row
            // ps.setInt(1, 23);
            // ps.setString(2, "Kartik");
            // ps.setInt(3, 100);
            // ps.executeUpdate();

            

            c.close();

        } catch(ClassNotFoundException e){
            System.out.println("Driver not found");
        }
        catch (SQLException e) {
            System.out.print("SQL Error"+ e);

        }
    }
}
