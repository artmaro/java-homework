package lec_14_locale.homework;

/**
 * Даны три файла resource bundles :
 * Train_en_US.properties: train=subway
 * Train_en_UK.properties: train=underground
 * Train_en.properties: ride = ride

 * Какие варианты позволят программе напечатать "ride
 * underground" ? Выберете все подходящие варианты.

 * A. Добавить строку  train=underground в файл  Train_en.properties
 * B. Добавить первой строкой Locale.setDefault(new Locale("en", "UK"));
 * C. Изменить в строке 3 на  Locale.ENGLISH);
 * D. Изменить в строке 3 на new  Locale("en", "UK"));
 * E. Удалить файл Train_en_US.properties
 */
public class ChooChoo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle rb = ResourceBundle.getBundle("Train",
                new Locale("en", "US"));                        //строка 3
        System.out.print(rb.getString("ride")
                + " " + rb.getString("train"));
    }
}