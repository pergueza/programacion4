import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean AddRoomToInventory(String id_admin, Room room){
        String sql = "INSERT INTO room(id_admin, name, capacity, priceNight, availability)\n" + //
                     "VALUES (?, ?, ?, ?, ?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id_admin);
            ps.setString(2, room.getName());
            ps.setString(3, room.getCapacity());
            ps.setString(4, room.getPriceNight());
            ps.setBoolean(5, room.getAvailability());
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

    public boolean roomIsAlreadyExist(String name){
        String sql = "SELECT * FROM room WHERE name = ?;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
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
