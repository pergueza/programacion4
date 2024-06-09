import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CheckRooms {
    private static CheckRooms instance;

    static JFrame fCheckRooms = new JFrame("Check Rooms - MyHotel");
    static JTable jt = new JTable(0, 0);
    static DefaultTableModel model = new DefaultTableModel();
    
    private CheckRooms(){
        JScrollPane sp = new JScrollPane(jt);

        jt.setBounds(30, 40, 200, 300);

        fCheckRooms.add(sp);
        fCheckRooms.setSize(300, 440);
        fCheckRooms.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void emptyTable(){
        for (int i = 0; i < model.getRowCount();) {
            model.removeRow(i);
        }
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
