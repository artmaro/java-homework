import java.sql.*;

/**


 */
public class DBMetadata {
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

            DatabaseMetaData metaData = conn.getMetaData();
            System.out.println("Displaying some of the database metadata from the Connection object");
                    System.out.println("Database is: " + metaData.getDatabaseProductName() + " " +
                            metaData.getDatabaseProductVersion());
            System.out.println("Driver is: " + metaData.getDriverName() + metaData.
                    getDriverVersion());
            System.out.println("The URL for this connection is: " + metaData.getURL());
            System.out.println("User name is: " + metaData.getUserName());
            System.out.println("Maximum no. of rows you can insert is: " + metaData.
                    getMaxRowSize());

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
