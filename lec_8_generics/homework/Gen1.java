package lec_8_generics.homework;

/**

 * Which statements could be inserted at  // INSERT DECLARATION HERE  to allow this code to
 * compile and run? (Choose all that apply.)
 *
 * Какие утверждения можно вставить в строку // INSERT DECLARATION HERE чтобы код запустился?
 *
 * A.  List<List<Integer>> table = new List<List<Integer>>();
 * B.  List<List<Integer>> table = new ArrayList<List<Integer>>();
 * C.  List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
 * D.  List<List, Integer> table = new List<List, Integer>();
 * E.  List<List, Integer> table = new ArrayList<List, Integer>();
 * F.  List<List, Integer> table = new ArrayList<ArrayList, Integer>();
 * G. None of the above
 */
public class Gen1 {
    public static void main(String[] args) {
        // INSERT DECLARATION HERE
        for (int i = 0; i <= 10; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= 10; j++)
                row.add(i * j);
            table.add(row);
        }
        for (List<Integer> row : table)
            System.out.println(row);
    }
}
