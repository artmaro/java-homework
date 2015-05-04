import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**


 */
public class ConnectionExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
                getConnection("jdbc:h2:~/test", "sa", "");
        // add application code here
        conn.close();
    }
}
