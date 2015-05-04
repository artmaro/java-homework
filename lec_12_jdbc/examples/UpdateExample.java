import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**


 */
public class UpdateExample {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.
                    getConnection("jdbc:h2:~/test", "sa", "");


            String updateTableSQL = "UPDATE DBUSER"
                    + " SET USERNAME = 'mkyong_new' "
                    + " WHERE USER_ID = 1";

            statement = conn.createStatement();
            statement.execute(updateTableSQL);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        // add application code here

    }
}
