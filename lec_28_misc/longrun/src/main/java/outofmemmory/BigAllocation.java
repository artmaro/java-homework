package outofmemmory;

/**
 * Created by ekokuykin on 02.07.15.
 */
public class BigAllocation {
    static final int SIZE=2*1024*1024;

    //запустить с ключом -Xmx12m
    public static void main(String[] args) {
        int[] i = new int[SIZE];
    }
}
