package lec_9_strings.homework;

/**
 What is the result?/Какой будет результат?
 A.  >abcefh<
 B.  >efhabc<
 C.  >abc ef h<
 D.  \>>ef h abc<
 E.  >abc ef h <

 */
public class Stone {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(">" + doStuff(s) + "<");
    }
    static String doStuff(String s) {
        s = s.concat(" ef h ");
        return s.trim();
    }
}