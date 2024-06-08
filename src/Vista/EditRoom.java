import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EditRoom {
    private static EditRoom instance;
    static ButtonActions buttonActions = new ButtonActions();

    static JFrame fEditRoom = new JFrame("Edit Room - MyHotel");
    
    static JButton bBack = new JButton("Back"),
    bEditRoom = new JButton("Edit room");
    
    static JTextField tfNumber = new JTextField(),
    tfCapacity = new JTextField(),
    tfPriceNight = new JTextField();
    
    private EditRoom(){
        JLabel lNumber = new JLabel("Room Number");
        JLabel lCapacity = new JLabel("Capacity");
        JLabel lPriceNight = new JLabel("Price Night");

        lNumber.setBounds(50, 30, 190, 30);
        tfNumber.setBounds(50, 60, 190, 30);
        lCapacity.setBounds(260, 30, 190, 30);
        tfCapacity.setBounds(260, 60, 190, 30);
        lPriceNight.setBounds(50, 100, 190, 30);
        tfPriceNight.setBounds(50, 130, 190, 30);
        
        bEditRoom.setBounds(50, 170, 190, 30);
        bBack.setBounds(260, 170, 190, 30);

        bEditRoom.addActionListener(buttonActions);
        bBack.addActionListener(buttonActions);

        fEditRoom.add(lNumber); fEditRoom.add(tfNumber);
        fEditRoom.add(lCapacity); fEditRoom.add(tfCapacity);
        fEditRoom.add(lPriceNight); fEditRoom.add(tfPriceNight);

        fEditRoom.add(bEditRoom); fEditRoom.add(bBack);
        fEditRoom.setSize(500, 280);
        fEditRoom.setLayout(null);
        fEditRoom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private static EditRoom getInstance(){
        if (instance == null){
            return instance = new EditRoom();
        }
        return instance;
    }

    public static void showEditRoom(){
        getInstance();

        fEditRoom.setVisible(true);
    }

    public static void closeEditRoom(){
        tfNumber.setText(null);
        tfCapacity.setText(null);
        tfPriceNight.setText(null);

        fEditRoom.dispose();
    }
}
