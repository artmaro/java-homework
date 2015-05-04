import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**


 */
public class InsertExample {
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


            String insertTableSQL = "INSERT INTO DBUSER"
                    + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) " + "VALUES"
                    + "(1,'mkyong','system', " + "'"
                    + getCurrentTimeStamp() + "')";

            statement = conn.createStatement();
            statement.execute(insertTableSQL);


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

    private static final DateFormat dateFormat = new SimpleDateFormat(
            "yyyy-MM-dd");
    private static String getCurrentTimeStamp() {

        java.util.Date today = new java.util.Date();
        return dateFormat.format(today.getTime());

    }
}
