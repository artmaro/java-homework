
import java.sql.*;

/*
Для запуска запроса
 drop table familygroup

 create table familygroup (
id int not null,
nickName varchar(100)
 )

 ALTER TABLE familygroup ADD PRIMARY KEY (id)


для запуска
java -jar h2-1.4.187.jar -webAllowOthers -tcpAllowOthers

настоящий порт 9092

 */


// To illustrate how to use savepoints with commits and rollbacks
class DbSavepoint {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        Connection connection = DriverManager.
                getConnection("jdbc:h2:tcp://localhost:9099/~/test", "sa", "");
        ResultSet resultSet = null;

        try {

            connection.setAutoCommit(false);
            Statement statement =
                    connection.createStatement(
                            ResultSet.TYPE_SCROLL_SENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
            resultSet = statement.executeQuery("SELECT * FROM familyGroup");

            System.out.println("Printing the contents of the table before inserting");
            while(resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " "
                        + resultSet.getString("nickName"));
            }
            /*if(true){
                return;
            }*/
            System.out.println("Starting to insert rows");
            // first insert
            resultSet.moveToInsertRow();
            resultSet.updateString("nickName", "Tom");
            resultSet.updateInt("id", 1);
            resultSet.insertRow();
            System.out.println("Inserted row for Tom");
            // our first savepoint is here...
            Savepoint firstSavepoint = connection.setSavepoint();

            // second insert
            resultSet.moveToInsertRow();
            resultSet.updateString("nickName", "Dick");
            resultSet.updateInt("id",2);
            resultSet.insertRow();
            System.out.println("Inserted row for Dick");
            // our second savepoint is here... after we inserted Dick
            // we can give a string name for savepoint
            Savepoint secondSavepoint = connection.setSavepoint("SavepointForDick");

            // third insert
            resultSet.moveToInsertRow();
            resultSet.updateString("nickName", "Harry");
            resultSet.updateInt("id", 3);
            resultSet.insertRow();
            System.out.println("Inserted row for Harry");
            // our thrid savepoint is here... for "Harry"
            Savepoint thirdSavepoint = connection.setSavepoint("ForHarry");
            System.out.println("Table updation complete...");

            // rollback to the state when Dick was inserted;
            // so the insert for Harry will be lost
            System.out.println(
                    "Rolling back to the state where Tom and Dick were inserted");
            connection.rollback(secondSavepoint);
            // commit the changes now and see what happens to the contents of the table
            connection.commit();
            System.out.println("Printing the contents of the table after commit");
            resultSet = statement.executeQuery("SELECT * FROM familyGroup");
            while(resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " "
                        + resultSet.getString("nickName"));
            }
        } catch (SQLException e) {
            connection.rollback();
            e.printStackTrace();
        }
        finally {
            if(connection != null) connection.close();
            if(resultSet != null) resultSet.close();
        }
    }
}