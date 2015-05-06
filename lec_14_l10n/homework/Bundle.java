package lec_14_locale.homework;

/**
 * Какой код из перечисленных варинатов скомпилируется при подстановке в метод main?
 * A.  Object obj = rb.getInteger("123");
 * B.  Object obj = rb.getInteger(123);
 * C.  Object obj = rb.getObject("123");
 * D.  Object obj = rb.getObject(123);
 * E.  Object obj = rb.getString("123");
 * F.  Object obj = rb.getString(123);
 */

public class KeyValue {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("rb.Bundle",
                Locale.getDefault());
        // insert code here
    }
}

//Отдельный файл
package rb;

public class Bundle extends java.util.ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][]{{"123", 456}};
    }
}
