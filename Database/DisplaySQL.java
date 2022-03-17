
//display detils of student having marks less than 60
import java.sql.*;

public class DisplaySQL {
    public static void main(String[] args) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbc");
            System.out.print("Sucess Driver connection");

            Connection c = DriverManager.getConnection("jdbc:odbc:college");
            System.out.println("Sucess connection");

            String sql = "select * from stud where marks>90 ";

            Statement st = c.createStatement();
            

            ResultSet rs = st.executeQuery(sql); // storing output to resultset
            while (rs.next()) {
                System.out.println("Roll No= " + rs.getInt(1));
                System.out.println("Name= " + rs.getString(2));
                System.out.println("Marks= " + rs.getInt(3));
            }
            ;

            rs.close();
            c.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Class Error");

        } catch (SQLException e) {
            System.out.println("SQL error" + e);

        }
    }
}
