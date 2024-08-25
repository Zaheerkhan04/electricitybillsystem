import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            // Connection parameters
            String url = "jdbc:mysql://localhost:3306/ebs"; // Replace with your database name
            String user = "root"; // Replace with your MySQL username
            String password = "987321"; // Replace with your MySQL password

            // Establishing a connection
            c = DriverManager.getConnection(url, user, password);

            // Creating a Statement object
            s = c.createStatement();

            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
