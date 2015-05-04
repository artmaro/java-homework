package lec_11_file.homework;

/**
 Вызов программы происходит с параметром:
 java Directories file2.txt
 причем программа запускается из каталога, у которого есть два подкаталога dir1 и dir2. В каталоге dir1 есть файл с именем file1.txt, в каталоге dir2 есть файл file2.txt.
 В результате выполнения программа выводит в консоль false true. Выберете все подходящие варианты, для вставки в исходных код программы

 A.     String path = d;
        System.out.print(file.exists() + " ");
 B.     String path = d;
        System.out.print(file.isFile() + " ");
 C.     String path = File.separator + d;
        System.out.print(file.exists() + " ");
 D.     String path = File.separator + d;
        System.out.print(file.isFile() + " ");

 */

import java.io.*;

class Directories {
    static String[] dirs = {"dir1", "dir2"};

    public static void main(String[] args) {
        for (String d : dirs) {
            // insert code 1 here
            File file = new File(path, args[0]);
            // insert code 2 here
        }
    }
}