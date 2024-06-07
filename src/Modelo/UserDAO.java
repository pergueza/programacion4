import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public User logInUser(String email, String passwrod){
        User user = new User();
        String sql = "SELECT customer.id, user.email, user.password\n" + //
                        "FROM user\n" + //
                        "LEFT JOIN customer ON user.idNumber=customer.id_user\n" + //
                        "WHERE email = ?\n" + //
                        "AND password = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, passwrod);
            rs = ps.executeQuery();
            if (rs.next()) {
                user.setIsCustomer(rs.getString("id"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return user;
    }


    public boolean signUpUser(User user){
        String sql = "INSERT INTO user(idType, idNumber, names, surnames, email, addres, city, cellphoneNumber, password)\n" + //
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        String sql2 = "INSERT INTO customer (id_user) VALUES (?);";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getIdentificationType());
            ps.setString(2, user.getIdentificationNumber());
            ps.setString(3, user.getNames());
            ps.setString(4, user.getSurnames());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getAdress());
            ps.setString(7, user.getCityResidence());
            ps.setString(8, user.getCellphoneNumber());
            ps.setString(9, user.getPassword());
            ps.execute();
            ps = con.prepareStatement(sql2);
            ps.setString(1, user.getIdentificationNumber());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public boolean userIdIsAlreadyExist(String idNumber){
        String sql = "SELECT * FROM user WHERE idNumber = ?;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, idNumber);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return false;
    }

    public boolean userEmailIsAlreadyExist(String email){
        String sql = "SELECT * FROM user WHERE email = ?;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return false;
    }
}
