package lec13_exceptions.homework;

/**
 What is the result?/Какой будет результат выполнения программы?
 A.  -t123t
 B.  -t12c3
 C.  -t123
 D.  -t1c3
 E.  -t1c23
 F.  None of the above;  main() throws an exception/метод main выбрасывает ошибку выполнения
 G. Compilation fails/Ошибка компиляции

 */
class Conductor {
    static String s = "-";
    class Whistle implements AutoCloseable {
        public void toot() { s += "t"; }
        public void close() { s += "c"; }
    }
    public static void main(String[] args) {
        new Conductor().run();
        System.out.println(s);
    }
    public void run() {
        try (Whistle w = new Whistle()) {
            w.toot();
            s += "1";
            throw new Exception();
        } catch (Exception e) { s += "2";
        } finally { s += "3"; } } }