import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminDAO {
    private Connect cn = new Connect();
    private Connection con;
    private PreparedStatement ps;

    public void addRoomToInventory(String id_admin, Room room){
        String sql = "INSERT INTO room(id_admin, number, capacity, priceNight)\n" + //
                     "VALUES (?, ?, ?, ?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id_admin);
            ps.setString(2, room.getNumber());
            ps.setString(3, room.getCapacity());
            ps.setString(4, room.getPriceNight());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public void removeRoomToInventory(String number){
        String sql = "DELETE FROM room WHERE number = ?;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, number);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public void editRoom(Room room){
        String sql = "UPDATE room SET capacity = ?, priceNight = ? WHERE number = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, room.getCapacity());
            ps.setString(2, room.getPriceNight());
            ps.setString(3, room.getNumber());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
