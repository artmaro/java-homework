package lec_10_io.homework;

/**
 And given that  myfile.txt contains the following two lines of data:
 ab
 cd

 Дан файл myfile.txt содержащий две строки данных
 ab
 cd

 What is the result?/Какой будет результат выполнения программы?
 A.  ab
 B.  abcd
 C.  ab
    cd
 D.  a
     b
     c
     d
 E. Compilation fails/Ошибка компиляции
 */

import java.io.*;

public class ReadingFor {
    public static void main(String[] args) {
        String s;
        try {
            FileReader fr = new FileReader("myfile.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((s = br.readLine()) != null)

                System.out.println(s);
            br.flush();
        } catch (IOException e) {
            System.out.println("io error");
        }
    }
}
