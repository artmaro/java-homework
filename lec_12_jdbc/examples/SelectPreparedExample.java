import java.sql.*;

/**


 */
public class SelectPreparedExample {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.
                    getConnection("jdbc:h2:~/test", "sa", "");

            String selectTableSQL = "SELECT USER_ID, USERNAME FROM DBUSER WHERE USER_ID = ?";

            statement = conn.prepareStatement(selectTableSQL);
            statement.setInt(1, 11);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                String userid = rs.getString("USER_ID");
                String username = rs.getString("USERNAME");

                System.out.println("userid : " + userid);
                System.out.println("username : " + username);

            }

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
