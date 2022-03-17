import java.sql.*;

public class LoadDriver {
    public static void main(String[] args) {
        try {

            // driver load
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");// class: sun.jdbc.odbc.JdbcOdbcDriver
            System.out.println("Driver Loaded Successfully");

            // connection
            Connection c = DriverManager.getConnection("jdbc:odbc:college"); // protocol:sub-protocol:data-source-name
            System.out.println("Connection Created");

            // Create Statement
            Statement st = c.createStatement();

            // Query
            String sql = "insert into stud(id,name,marks) values(101,'Alex',99)";

            // execute query
            st.executeUpdate(sql);
            System.out.println("Row Inserted ");

            // close connection session
            c.close();

        } catch (SQLException e) {
            System.out.print("SQL Query Expection " + e);

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");

        }
    }
}
