import java.sql.*;

import static java.sql.ResultSet.CONCUR_UPDATABLE;

/**


 */
public class ResultSetModify {
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

            String selectTableSQL = "SELECT USER_ID, USERNAME from DBUSER";

            statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,CONCUR_UPDATABLE);
            statement.execute(selectTableSQL);
            ResultSet rs = statement.executeQuery(selectTableSQL);

            while (rs.next()) {

                String userid = rs.getString("USER_ID");
                String username = rs.getString("USERNAME");

                System.out.println("userid : " + userid);
                System.out.println("username : " + username);

                if (userid.equals("101")){
                    rs.updateString("USERNAME", "updated!");
                    rs.updateRow();
                }

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
