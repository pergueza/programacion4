import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MakeReservation {
    private static MakeReservation instance;
    private static ButtonActions buttonActions = new ButtonActions();

    static JFrame fMakeReservation = new JFrame("Make Reservation - MyHotel");
    static JTable tMakeReservation = new JTable(0, 0);

    static JButton bBack = new JButton("Back"),
    bMakeReservation = new JButton("Reservation");
    
    private MakeReservation(){
        JScrollPane sp = new JScrollPane(tMakeReservation);
        
        sp.setBounds(50, 30, 200, 350);
        bMakeReservation.setBounds(75, 400, 150, 30);
        bBack.setBounds(112, 440, 75, 30);

        bMakeReservation.addActionListener(buttonActions);
        bBack.addActionListener(buttonActions);

        fMakeReservation.add(sp);
        fMakeReservation.add(bMakeReservation);
        fMakeReservation.add(bBack);
        fMakeReservation.setSize(300, 540);
        fMakeReservation.setLayout(null);
        fMakeReservation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private static MakeReservation getInstance(){
        if (instance == null){
            return instance = new MakeReservation();
        }
        return instance;
    }

    public static void showMakeReservation(){
        getInstance();
        fMakeReservation.setVisible(true);
    }

    public static void closeMakeReservation(){

        fMakeReservation.dispose();
    }
}
