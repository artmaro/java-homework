import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

/**


 */

interface Base{
    void foo() throws IOException;
}

class SubClassOne implements Base{

    @Override
    public void foo() throws FileAlreadyExistsException {
        throw new FileAlreadyExistsException("msg");
    }
}

class SubClassTwo implements Base {

    //Необходимо выбрасывать только IOException или его подклассы
    //Не скомпилируется
    @Override
    public void foo() throws SQLException{
        throw new SQLException("aa");
    }
}

class SubClassThree implements Base{

    //Скомпилируется т.к. ArrayIndexOutOfBoundsException подкласс Runtime Exception
    @Override
    public void foo() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("bb");
    }
}

public class ExceptionInheritance {
    public static void main(String[] args) throws SQLException {
        new SubClassTwo().foo();
    }
}
