package lec_9_strings.homework;

/**

 And given the command-line invocation:
 java Archie "\d+" ab2c4d67

 Программа запускается с аргументами java Archie "\d+" ab2c4d67

 What is the result?/Какой будет результат?
 A.  0
 B.  3
 C.  4
 D.  8
 E.  9
 F.  Compilation fails/Ошибка компиляции

 */

import java.util.regex.*;

public class Archie {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        int count = 0;
        while (m.find())
            count++;
        System.out.print(count);
    }
}