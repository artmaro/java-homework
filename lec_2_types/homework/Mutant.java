package lec_2_types.homework;

/**
 Which two substrings will be included in the result? (Choose two.)/Какая подстрока будет содержаться в ответе? Выберете две
 A.  .abc .
 B.  .ABCd .
 C.  .ABCD .
 D.  .cbad .
 E.  .dcba .

 */
public class Mutant {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        String s = "abc";
        sb.reverse().append("d");
        s.toUpperCase().concat("d");
        System.out.println("." + sb + ". ." + s + ".");
    }
}
