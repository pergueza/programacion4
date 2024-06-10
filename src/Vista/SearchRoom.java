import java.time.LocalDate;
import java.time.ZoneId;

import javax.swing.*;

public class SearchRoom {
    private static SearchRoom instance;
    private static ButtonActions buttonActions = new ButtonActions();

    static JFrame fSearchRoom = new JFrame("Search Rooms - MyHotel");
    
    static JButton bBack = new JButton("Back"),
    bSearchRoom = new JButton("Rooms");
    
    static JTextField tfCapacity = new JTextField(),
                      tfPriceNight = new JTextField();

    static JFormattedTextField tfCheckIn = new JFormattedTextField(),
                               tfCheckOut = new JFormattedTextField();

    private SearchRoom(){
        JLabel lCapacity = new JLabel("Room Capacity"),
               lPriceNight = new JLabel("Price Night"),
               lCheckIn = new JLabel("CheckIn"),
               lCheckOut = new JLabel("CheckOut");

        tfCheckIn.setValue(LocalDate.now(ZoneId.systemDefault()).toString());
        tfCheckOut.setValue(LocalDate.now(ZoneId.systemDefault()).plusDays(1)
                            .toString());

        lCapacity.setBounds(50, 10, 160, 30);
        tfCapacity.setBounds(50, 40, 160, 30);
        lPriceNight.setBounds(50, 90, 160, 30);
        tfPriceNight.setBounds(50, 130, 160, 30);
        lCheckIn.setBounds(50, 180, 160, 30);
        tfCheckIn.setBounds(50, 220, 160, 30);
        lCheckOut.setBounds(50, 270, 160, 30);
        tfCheckOut.setBounds(50, 310, 160, 30);
        
        bSearchRoom.setBounds(50, 370, 160, 30);
        bBack.setBounds(50, 410, 160, 30);

        bSearchRoom.addActionListener(buttonActions);
        bBack.addActionListener(buttonActions);

        fSearchRoom.add(lCapacity); fSearchRoom.add(tfCapacity);
        fSearchRoom.add(lPriceNight); fSearchRoom.add(tfPriceNight);
        fSearchRoom.add(lCheckIn); fSearchRoom.add(tfCheckIn);
        fSearchRoom.add(lCheckOut); fSearchRoom.add(tfCheckOut);
        fSearchRoom.add(bSearchRoom); fSearchRoom.add(bBack);

        fSearchRoom.setSize(260, 530);
        fSearchRoom.setLayout(null);
        fSearchRoom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private static SearchRoom getInstance(){
        if (instance == null){
            return instance = new SearchRoom();
        }
        return instance;
    }

    public static void showSearchRoom(){
        tfCapacity.setText("0");
        tfPriceNight.setText(null);
        tfCheckIn.setText(LocalDate.now(ZoneId.systemDefault()).toString());
        tfCheckOut.setText(LocalDate.now(ZoneId.systemDefault()).plusDays(1)
        .toString());
        getInstance();

        fSearchRoom.setVisible(true);
    }

    public static void closeSearchRoom(){
        tfCapacity.setText(null);

        fSearchRoom.dispose();
    }
}