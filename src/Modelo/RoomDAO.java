import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoomDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Room getRoom(String roomNumber){
        Room room = new Room();
        String sql = "SELECT id, number, capacity, priceNight FROM room WHERE number = ?;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, roomNumber);
            rs = ps.executeQuery();
            if (rs.next()) {
                room.setId(rs.getString("id"));
                room.setNumber(rs.getString("number"));
                room.setCapacity(rs.getString("capacity"));
                room.setPriceNight(rs.getString("priceNight"));
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
        return room;
    }

    public boolean roomIsAlreadyExist(String number){
        String sql = "SELECT * FROM room WHERE number = ?;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, number);
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

    public List<Room> roomList(){
        List<Room> listRoom = new ArrayList<>();
        String sql = "SELECT * FROM room;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);;
            rs = ps.executeQuery();
            while (rs.next()) {
                Room room = new Room();
                room.setId(rs.getString("id"));
                room.setId_admin(rs.getString("id_admin"));
                room.setNumber(rs.getString("number"));
                room.setCapacity(rs.getString("capacity"));
                room.setPriceNight(rs.getString("priceNight"));
                listRoom.add(room);
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
        return listRoom;
    }
}
