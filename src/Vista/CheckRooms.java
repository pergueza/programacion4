import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CheckRooms {
    private static CheckRooms instance;

    static JFrame fCheckRooms = new JFrame("Check Rooms - MyHotel");
    static JTable tCheckRooms = new JTable(0, 0);
    
    private CheckRooms(){
        JScrollPane sp = new JScrollPane(tCheckRooms);

        fCheckRooms.add(sp);
        fCheckRooms.setSize(300, 440);
        fCheckRooms.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private static CheckRooms getInstance(){
        if (instance == null){
            return instance = new CheckRooms();
        }
        return instance;
    }

    public static void showCheckRooms(){
        getInstance();
        fCheckRooms.setVisible(true);
    }

    public static void closeCheckRooms(){

        fCheckRooms.dispose();
    }
}
