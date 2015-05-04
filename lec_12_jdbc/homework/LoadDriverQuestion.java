package lec_12_jdbc.homework;

/**
    Дан следующий код. Какую строку необходимо вставить, чтобы драйвер корректно загрузился?

 A  DriverManager.registerDriver("org.gjt.mm.mysql.Driver");
 B.  Class.forName("org.gjt.mm.mysql.Driver");
 C.  DatabaseMetaData.loadDriver("org.gjt.mm.mysql.Driver");
 D.  Driver.connect("org.gjt.mm.mysql.Driver");
 E.  DriverManager.getDriver("org.gjt.mm.mysql.Driver");
 */
public class LoadDriverQuestion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://SolDBServer/soldb";
        String user = "sysEntry";
        String pwd = "fo0B3@r";
        // INSERT CODE HERE
        Connection conn = DriverManager.getConnection(url, user, pwd);
    }
}
