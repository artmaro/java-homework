package hot.code;

import java.util.Iterator;

public class StudentList implements Iterable<String>, Iterator<String>{

    String[] studens = {"Anna", "Alex", "Boris"};
    int index = 0;

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < studens.length;
    }

    @Override
    public String next() {
        return studens[index++];
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();
        for (String o : list) {
            System.out.println("o = " + o);
        }
    }
}
