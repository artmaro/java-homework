import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**


 */
public class InsertPreparedExample {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = DriverManager.
                    getConnection("jdbc:h2:~/test", "sa", "");


            String insertTableSQL = "INSERT INTO DBUSER"
                    + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) VALUES"
                    + "(?,?,?,?)";

            preparedStatement = conn.prepareStatement(insertTableSQL);

            preparedStatement.setInt(1, 11);
            preparedStatement.setString(2, "mkyong");
            preparedStatement.setString(3, "system");
            preparedStatement.setString(4, getCurrentTimeStamp());

            // execute insert SQL stetement
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
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
