package lec_12_jdbc.homework;

/**
 Определен запрос
 String query = "UPDATE Customer SET EMail='John.Smith@comcast.net' WHERE CustomerID = 5000";

 Предположим, что объект Connection conn уже создан и что запрос возвращает валидный результат из БД. Какие варианты кода скомпилируются и выполнят update корректно?

 A.  Statement stmt = conn.createStatement();
 stmt.executeQuery(query);
 B.  Statement stmt = conn.createStatement(query);
 stmt.executeUpdate();
 C.  Statement stmt = conn.createStatement();
 stmt.setQuery(query);
 stmt.execute();
 D.  Statement stmt = conn.createStatement();
 stmt.execute(query);
 E.  Statement stmt = conn.createStatement();
 ResultSet rs = stmt.executeUpdate(query);

 */
public class HowToUpdate {
}
