import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private Connect cn = new Connect();
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public List<Room> roomList(String checkIn, String checkOut, String capacity, String priceNight){
        List<Room> listRoom = new ArrayList<>();
        String sql = "SELECT DISTINCT number, capacity, priceNight\n" + //
                        "FROM\n" + //
                        "    (SELECT room.number, room.capacity, room.priceNight, reservation.checkIn, reservation.checkOut\n" + //
                        "    FROM room\n" + //
                        "    LEFT JOIN reservation\n" + //
                        "    ON room.id=reservation.id_room\n" + //
                        "    UNION ALL\n" + //
                        "    SELECT room.number, room.capacity, room.priceNight, reservation.checkIn, reservation.checkOut\n" + //
                        "    FROM room\n" + //
                        "    RIGHT JOIN reservation\n" + //
                        "    ON room.id=reservation.id_room\n" + //
                        "    WHERE (reservation.checkIn NOT BETWEEN ? AND ?)\n" + //
                        "    AND\n" + //
                        "    (reservation.checkOut NOT BETWEEN ? AND ?)) AS T\n" + //
                        "WHERE capacity >= ? AND priceNight <= ? ORDER BY number;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, checkIn);
            ps.setString(2, checkOut);
            ps.setString(3, checkIn);
            ps.setString(4, checkOut);
            ps.setString(5, capacity);
            ps.setString(6, priceNight);
            rs = ps.executeQuery();
            while (rs.next()) {
                Room room = new Room();
                room.setNumber(rs.getString("number"));
                room.setCapacity(rs.getString("capacity"));
                room.setPriceNight(rs.getString("priceNight"));
                listRoom.add(room);
            }
        } catch (SQLException e) {
            System.out.println("pan");
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
