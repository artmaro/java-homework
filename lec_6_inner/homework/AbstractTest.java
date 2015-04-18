package lec_6_inner.homework;

/**
 * What is the result?/Какой результат выполнения программы?
 * A.  57 22
 * B.  45 38
 * C.  45 57
 * D. An exception occurs at runtime/Ошибка времени выполнения
 * E. Compilation fails/Ошибка компиляции
 */
public abstract class AbstractTest {
    public int getNum() {
        return 45;
    }

    public abstract class Bar {
        public int getNum() {
            return 38;
        }
    }

    public static void main(String[] args) {
        AbstractTest t = new AbstractTest() {
            public int getNum() {
                return 22;
            }
        };
        AbstractTest.Bar f = t.new Bar() {
            public int getNum() {
                return 57;
            }
        };
        System.out.println(f.getNum() + " " + t.getNum());
    }
}
