package lec_6_inner.homework;

/**
 * Which, inserted independently at line // insert code here, compile and produce the output "spooky"?* (Choose all that apply.)
 *
 Какой код необходимо встравить в строчку // insert code here, чтобы в результате получилось слово  "spooky"?
 Выберете все подходящие варианты.

 * A.  Sanctum s = c.new Sanctum();
 * B.  c.Sanctum s = c.new Sanctum();
 * C.  c.Sanctum s = Cathedral.new Sanctum();
 * D.  Cathedral.Sanctum s = c.new Sanctum();
 * E.  Cathedral.Sanctum s = Cathedral.new Sanctum();
 */
public class Tour {
    public static void main(String[] args) {
        Cathedral c = new Cathedral();
        // insert code here
        s.go();
    }
}

class Cathedral {
    class Sanctum {
        void go() {
            System.out.println("spooky");
        }
    }
}