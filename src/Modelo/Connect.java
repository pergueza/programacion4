import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    Connection con;
    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://uxcddlyzeachapze:2Nivvkk1EVbBhItRzxv5@bbnp3idgqwd2qcipu6fn-mysql.services.clever-cloud.com:3306/bbnp3idgqwd2qcipu6fn";
            con = DriverManager.getConnection(myBD, "uxcddlyzeachapze", "2Nivvkk1EVbBhItRzxv5");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
