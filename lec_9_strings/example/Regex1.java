package lec_9_strings.example;

/**
 ^     - (крышка, цирркумфлекс) начало проверяемой строки
 $     - (доллар) конец проверяемой строки
 .     - (точка) представляет собой сокращенную форму записи для символьного класса, совпадающего с любым символом
 |     -  означает «или». Подвыражения, объединенные этим способом, называются альтернативами (alternatives)
 ?     - (знак вопроса) означает, что предшествующий ему символ является необязательным
 +     -  обозначает «один или несколько экземпляров непосредственно предшествующего элемента
 *     –  любое количество экземпляров элемента (в том числе и нулевое)
 \\d   –  цифровой символ
 \\D   –  не цифровой символ
 \\s   –  пробельный символ
 \\S   –  не пробельный символ
 \\w   –  буквенный или цифровой символ или знак подчёркивания
 \\W   –  любой символ, кроме буквенного или цифрового символа или знака подчёркивания

 \\. - экранирование точки
 (группа)

 [aя] а или я
 [а-я]	Диапазон символов или цифр
 [^a-я] Все кроме а-я

 expr? 0 или 1 совпадение
 expr* 0 или больше совпадений
 expr+ 1 или больше совпадений
 expr{x} точно х совпадений
 expr{x, y} количество совпадений от х до у
 expr{x,} х или больше совпадений
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex1 {
    public static void main(String[] args) {
        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
        Pattern pattern = Pattern.compile("\\w+");//находит все слова
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}