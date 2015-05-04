/**


 */


class FirstException extends Exception {

}

class SecondException extends Exception {

}

public class RethrowExample {

    public static void rethrow1() throws FirstException {
        try {
            throw new FirstException();//можно перебросить исключение, если оно в блоке явно объявлено
        } catch (Exception e) {
            throw e;
        }
    }

    public static void rethrow2() throws FirstException {
        try {
            throw new FirstException();
        } catch (Exception e) {
            //   e = new FirstException();//Нельзя изменять объект, иначе произойдет ошибка компиляции
            throw e;
        }
    }

    public static void rethrow3() throws FirstException {
        try {
            if (true) {
                throw new SecondException();
            }
            throw new FirstException();
        } catch (Exception e) {
            //throw e; //Нескомпилируется, т.к. явно может придти SecondException, а в сигнатуре объявлен только FirstException
        }
    }

    public static void rethrow4() throws FirstException {
        try {
            if (true) {
                throw new SecondException();
            }
            throw new FirstException();
        } catch (SecondException e) {

        } catch (Exception e) {
            throw e; //Так сработает, т.к. SecondException перехвачен уровнем выше
        }
    }


    public static void main(String[] args) {
        try {
            rethrow1();
        } catch (FirstException firstException) {
            firstException.printStackTrace();

        }


    }

}
