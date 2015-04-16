package lec_4_class.homework;

/**
 * Which two are true about the objects created within  main() , and which are eligible for garbage
 * collection when line 14 is reached?
 * Какие утверждения правдивы относительно этого кода? Какие объекты будут доступны сборщику мусора при заверщении метода?
 * <p>
 * <p>
 * A. Three objects were created/3 объекта созданы
 * B. Four objects were created/4 объекта созданы
 * C. Five objects were created/5 объекта созданы
 * D. Zero objects are eligible for GC/0 объектов будут очищены сборщиком
 * E. One object is eligible for GC/1 объект будет очищен
 * F.  Two objects are eligible for GC/2 объекта будут очищены
 * G. Three objects are eligible for GC/3 объекта будут очищены
 */
class Dozens {
    int[] dz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
}

public class Eggs {
    public static void main(String[] args) {
        Dozens[] da = new Dozens[3];
        da[0] = new Dozens();
        Dozens d = new Dozens();
        da[1] = d;
        d = null;
        da[1] = null;

    }
}
