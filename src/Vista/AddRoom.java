import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddRoom {
    private static AddRoom instance;
    private static ButtonActions buttonActions = new ButtonActions();

    static JFrame fAddRoom = new JFrame("Add Room - MyHotel");
    
    static JButton bBack = new JButton("Back"),
    bAddRoom = new JButton("Add room");
    
    static JTextField tfNumber = new JTextField(),
    tfCapacity = new JTextField(),
    tfPriceNight = new JTextField();
    
    private AddRoom(){
        JLabel lNumber = new JLabel("Room Number");
        JLabel lCapacity = new JLabel("Capacity");
        JLabel lPriceNight = new JLabel("Price Night");

        lNumber.setBounds(50, 30, 190, 30);
        tfNumber.setBounds(50, 60, 190, 30);
        lCapacity.setBounds(260, 30, 190, 30);
        tfCapacity.setBounds(260, 60, 190, 30);
        lPriceNight.setBounds(50, 100, 190, 30);
        tfPriceNight.setBounds(50, 130, 190, 30);
        
        bAddRoom.setBounds(50, 170, 190, 30);
        bBack.setBounds(260, 170, 190, 30);

        bAddRoom.addActionListener(buttonActions);
        bBack.addActionListener(buttonActions);

        fAddRoom.add(lNumber); fAddRoom.add(tfNumber);
        fAddRoom.add(lCapacity); fAddRoom.add(tfCapacity);
        fAddRoom.add(lPriceNight); fAddRoom.add(tfPriceNight);

        fAddRoom.add(bAddRoom); fAddRoom.add(bBack);
        fAddRoom.setSize(500, 280);
        fAddRoom.setLayout(null);
        fAddRoom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private static AddRoom getInstance(){
        if (instance == null){
            return instance = new AddRoom();
        }
        return instance;
    }

    public static void showAddRoom(){
        getInstance();

        fAddRoom.setVisible(true);
    }

    public static void closeAddRoom(){
        tfNumber.setText(null);
        tfCapacity.setText(null);
        tfPriceNight.setText(null);

        fAddRoom.dispose();
    }
}
