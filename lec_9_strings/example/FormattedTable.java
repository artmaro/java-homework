package lec_9_strings.example;

/**

 Symbol Description
 %b Boolean
 %c Character
 %d Decimal integer (signed)
 %e Floating point number in scientific format
 %f Floating point numer in decimal format
 %g Floating point numer in decimal or scientific format (depending on the
 value passed as argument)
 %h Hashcode of the passed argument
 %n Line separator (new line character)
 %o Integer formatted as an octal value
 %s String
 %t Date/time
 %x Integer formatted as an hexadecimal value

 *
 *
 *
 -----------------------------------------------------------------------------------
 Player Matches Goals Goals per match
 -----------------------------------------------------------------------------------
 Demando 100 122 1.2
 Mushi 80 100 1.3
 Peale 150 180 1.2
 -----------------------------------------------------------------------------------

 */
// This program demonstrates the use of format specifiers in printf
class FormattedTable {
    static void line() {
        System.out.
                println("-----------------------------------------------------------------");
    }
    static void printHeader() {
        System.out.printf("%-15s \t %s \t %s \t %s \n",
                "Player", "Matches", "Goals", "Goals per match");
    }
    static void printRow(String player, int matches, int goals) {
        System.out.printf("%-15s \t %5d \t\t %d \t\t %.1f \n",
                player, matches, goals, ((float)goals/(float)matches));
    }
    public static void main(String[] str) {
        FormattedTable.line();
        FormattedTable.printHeader();
        FormattedTable.line();
        FormattedTable.printRow("Demando", 100, 122);
        FormattedTable.printRow("Mushi", 80, 100);
        FormattedTable.printRow("Peale", 150, 180);
        FormattedTable.line();
    }
}