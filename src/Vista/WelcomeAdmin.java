import javax.swing.*;

public class WelcomeAdmin {
    private static MenuActionsAdmin menuActions = new MenuActionsAdmin();

    static JMenuItem iCheckRooms = new JMenuItem("Check rooms..."),
                     iAddRoomToInventory = new JMenuItem("Add room to inventory..."),
                     iEditRoomInInventory = new JMenuItem("Edit room in inventory..."),
                     iRemoveRoomFromInventory = new JMenuItem("Remove room from inventory"),

                     iSignOff = new JMenuItem("Sign Off...");
    
    static JFrame frameWelcome = new JFrame("Welcome - MyHotel"),
                  frameDefault = new JFrame();

    static JMenuBar menuBar = new JMenuBar();
    static JMenu menuRooms = new JMenu("Rooms"),
                 menuUser = new JMenu("User");

    
    public static void showWelcome(){
        menuUser.add(iSignOff);

        menuRooms.add(iCheckRooms);
        menuRooms.add(iAddRoomToInventory);
        menuRooms.add(iEditRoomInInventory);
        menuRooms.add(iRemoveRoomFromInventory);

        menuBar.add(menuRooms);
        menuBar.add(menuUser);

        iCheckRooms.addActionListener(menuActions);
        iAddRoomToInventory.addActionListener(menuActions);
        iEditRoomInInventory.addActionListener(menuActions);
        iRemoveRoomFromInventory.addActionListener(menuActions);
        iSignOff.addActionListener(menuActions);

        frameWelcome.setJMenuBar(menuBar);
        createDefaultFrame(frameWelcome);
    }


    public static void createDefaultFrame(JFrame frame){
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
