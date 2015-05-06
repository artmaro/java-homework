package lec_14_locale.homework;

/**
 * Предположим текущая локаль Итальянская. Какой из resource bundle файлов будет использован? Выберете все походящие варианты. Предположение, что в программе доступен только один файл.
 * A.  Flag.java
 * B.  Flag_CA.properties
 * C.  Flag_en.java
 * D.  Flag_en.properties
 * E.  Flag_en_CA.properties
 * F.  Flag_fr_CA.properties
 */
public class Canada {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Flag",
                new Locale("en_CA"));
        System.out.println(rb.getString("key"));
    }
}
