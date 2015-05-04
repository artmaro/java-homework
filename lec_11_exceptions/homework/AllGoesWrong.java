package lec13_exceptions.homework;

/**
 What is the result?/Какой будет результат выполнения программы?
 A.  ad
 B.  acd
 C.  cd
 D.  d
 E. Compilation fails/Ошибка компиляции
 F. An exception is thrown at runtime/Ошибка времени выполнения

 */
class AllGoesWrong {
    public static void main(String[] args) {
        AllGoesWrong a = new AllGoesWrong();
        try {
            a.blowUp();
            System.out.println("a");
        } catch (IOException e | SQLException e) {
            System.out.println("c");
        } finally {
            System.out.println("d");
        }
    }
    void blowUp() throws IOException, SQLException {
        throw new SQLException();
    }
}
