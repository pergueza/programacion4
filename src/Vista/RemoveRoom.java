import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RemoveRoom {
    private static RemoveRoom instance;
    private static ButtonActions buttonActions = new ButtonActions();

    static JFrame fRemoveRoom = new JFrame("Remove Room - MyHotel");
    
    static JButton bBack = new JButton("Back"),
    bRemoveRoom = new JButton("Remove");
    
    static JTextField tfNumber = new JTextField();
    
    private RemoveRoom(){
        JLabel lNumber = new JLabel("Room Number");

        lNumber.setBounds(50, 10, 100, 30);
        tfNumber.setBounds(50, 40, 100, 30);;
        
        bRemoveRoom.setBounds(170, 40, 100, 30);
        bBack.setBounds(280, 40, 100, 30);

        bRemoveRoom.addActionListener(buttonActions);
        bBack.addActionListener(buttonActions);

        fRemoveRoom.add(lNumber); fRemoveRoom.add(tfNumber);

        fRemoveRoom.add(bRemoveRoom); fRemoveRoom.add(bBack);
        fRemoveRoom.setSize(430, 140);
        fRemoveRoom.setLayout(null);
        fRemoveRoom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private static RemoveRoom getInstance(){
        if (instance == null){
            return instance = new RemoveRoom();
        }
        return instance;
    }

    public static void showRemoveRoom(){
        getInstance();

        fRemoveRoom.setVisible(true);
    }

    public static void closeRemoveRoom(){
        tfNumber.setText(null);

        fRemoveRoom.dispose();
    }
}