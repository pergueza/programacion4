import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddRoom {
    private static AddRoom instance;
    static ButtonActions buttonActions = new ButtonActions();

    static JFrame fAddRoom = new JFrame("Add Room - MyHotel");
    
    static JButton bBack = new JButton("Back"),
    bAddRoom = new JButton("Add room");
    
    static JTextField tfName = new JTextField(),
    tfCapacity = new JTextField(),
    tfPriceNight = new JTextField();

    static JRadioButton rbAvailiable = new JRadioButton("Availiable"),
                        rbNotAvailable = new JRadioButton("Not available");

    static ButtonGroup bg = new ButtonGroup(); 
    
    private AddRoom(){
        JLabel lName = new JLabel("Name Room");
        JLabel lCapacity = new JLabel("Capacity");
        JLabel lPriceNight = new JLabel("Price Night");

        lName.setBounds(50, 30, 190, 30);
        tfName.setBounds(50, 60, 190, 30);
        lCapacity.setBounds(260, 30, 190, 30);
        tfCapacity.setBounds(260, 60, 190, 30);
        lPriceNight.setBounds(50, 100, 190, 30);
        tfPriceNight.setBounds(50, 130, 190, 30);
        rbAvailiable.setBounds(260, 100, 190, 30);
        rbNotAvailable.setBounds(260, 130, 190, 30);
        
        bAddRoom.setBounds(50, 390, 190, 30);
        bBack.setBounds(260, 390, 190, 30);

        bAddRoom.addActionListener(buttonActions);
        bBack.addActionListener(buttonActions);

        fAddRoom.add(lName); fAddRoom.add(tfName);
        fAddRoom.add(lCapacity); fAddRoom.add(tfCapacity);
        fAddRoom.add(lPriceNight); fAddRoom.add(tfPriceNight);
        bg.add(rbAvailiable); bg.add(rbNotAvailable);
        fAddRoom.add(rbAvailiable); fAddRoom.add(rbNotAvailable);

        fAddRoom.add(bAddRoom); fAddRoom.add(bBack);
        fAddRoom.setSize(500, 500);
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
        tfName.setText(null);
        tfCapacity.setText(null);
        tfPriceNight.setText(null);
        bg.clearSelection();

        fAddRoom.dispose();
    }
}
