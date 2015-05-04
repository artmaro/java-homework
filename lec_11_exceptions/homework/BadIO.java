package lec13_exceptions.homework;

/**
 Which inserted independently at  // insert code here will compile and produce the output:  b ?(Choose all that apply.)
 Что необходимо добавить в строку // insert code, чтобы код скомпилировался и в результате получилось b? Выберете все подходящие варианты.

 A.  catch(Exception e) {
 B.  catch(FileNotFoundException e) {
 C.  catch(IOException e) {
 D.  catch(IOException | SQLException e) {
 E.  catch(IOException e | SQLException e) {
 F.  catch(SQLException e) {
 G.  catch(SQLException | IOException e) {
 H.  catch(SQLException e | IOException e) {

 */
class BadIO {
    public static void main(String[] args) {
        BadIO a = new BadIO();
        try {
            a.fileBlowUp();
            a.databaseBlowUp();
            System.out.println("a");
        } // insert code here
        System.out.println("b");
    } catch (Exception e) {
        System.out.println("c");
    } }
    void databaseBlowUp() throws SQLException {
        throw new SQLException();
    }
    void fileBlowUp() throws IOException {
        throw new IOException();
    }}