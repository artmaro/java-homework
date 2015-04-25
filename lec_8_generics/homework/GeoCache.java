package lec_8_generics.homework;

/**
 Given:
 3. import java.util.*;
 4. public class GeoCache {
 5. public static void main(String[] args) {
 6. String[] s = {"map", "pen", "marble", "key"};
 7. Othello o = new Othello();
 8. Arrays.sort(s,o);
 9. for(String s2: s) System.out.print(s2 + " ");
 10. System.out.println(Arrays.binarySearch(s, "map"));
 11. }
 12. static class Othello implements Comparator<String> {
 13. public int compare(String a, String b) { return b.compareTo(a); }
 14. }
 15. }
 Which are true? (Choose all that apply.)
 A. Compilation fails
 B. The output will contain a  1
 C. The output will contain a  2
 D. The output will contain a  –1
 E. An exception is thrown at runtime
 F.  The output will contain  "key map marble pen"
 G. The output will contain  "pen marble map key"

 */
public class GeoCache {
}
