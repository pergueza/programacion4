import javax.swing.*;

public class WelcomeAdmin {
    private static MenuActionsAdmin menuActions = new MenuActionsAdmin();

    static JMenuItem iCheckAvailabilityRoom = new JMenuItem("Check availability rooms..."),
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

        menuRooms.add(iCheckAvailabilityRoom);
        menuRooms.add(iAddRoomToInventory);
        menuRooms.add(iEditRoomInInventory);
        menuRooms.add(iRemoveRoomFromInventory);

        menuBar.add(menuRooms);
        menuBar.add(menuUser);

        iCheckAvailabilityRoom.addActionListener(menuActions);
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


    public static void showCheckAvailabilityRoom(){
        frameDefault.setTitle("Check Availability Rooms - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showAddRoomToInventory(){
        frameDefault.setTitle("Add Room To Inventory - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showEditRoomInInventory(){
        frameDefault.setTitle("Edit Room In Inventory - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showRemoveRoomFromInventory(){
        frameDefault.setTitle("Remove Room From Inventory - MyHotel");
        createDefaultFrame(frameDefault);
    }
}
