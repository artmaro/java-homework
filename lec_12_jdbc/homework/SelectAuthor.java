package lec_12_jdbc.homework;

/**
 Assuming a  Connection object has already been created (conn) and that the query produces
 a valid result, what is the result?

 Предположим, что объект Connection conn уже создан и что запрос возвращает валидный результат из БД, какой будет результат выполнения программы?

 A. Compiler error at line X/Ошибка компиляции в строке Х
 B. Compiler error at line Y/Ошибка компиляции в строке У
 C. No result/Результата не будет
 D. The first name from the first row that matches 'Rand%'/Возвращает поле "FirstName" для первой строки, для которой выполнено условие LastName LIKE 'Rand%'
 E.  SQLException
 F.  A runtime exception/Ошибка времени выполнения

 */
public class SelectAuthor {
    public static void main(String[] args) {
        try {
            ... создание conn

            Statement stmt = conn.createStatement();
            String query =
                    "SELECT * FROM Author WHERE LastName LIKE 'Rand%'";
            ResultSet rs = stmt.executeQuery(query); // Line X
            if (rs == null) { // Line Y
                System.out.println("No results");
            } else {
                System.out.println(rs.getString("FirstName"));
            }
        } catch (SQLException se) {
            System.out.println("SQLException");
        }
    }
}
