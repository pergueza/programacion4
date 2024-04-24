import javax.swing.*;

public class Welcome {
    private static MenuActions menuActions = new MenuActions();

    static JMenuItem iMakeReservation = new JMenuItem("Make a reservation..."),
                iModifyReservation = new JMenuItem("Modify reservation..."),
                iCancelReservation = new JMenuItem("Cancel reservation..."),
                iHistoryReservation = new JMenuItem("View Reservation History..."),

                iSearchAvailableRooms = new JMenuItem("Search Available Rooms..."),
                iDetailsRooms = new JMenuItem("See Room Details..."),
                     
                iCheckAvailabilityRoom = new JMenuItem("Check availability rooms..."),
                iAddRoomToInventory = new JMenuItem("Add room to inventory..."),
                iEditRoomInInventory = new JMenuItem("Edit room in inventory..."),
                iRemoveRoomFromInventory = new JMenuItem("Remove room from inventory"),

                iSignOff = new JMenuItem("Sign Off...");
    
    static JFrame frameWelcome = new JFrame("Welcome - MyHotel"),
                  frameDefault = new JFrame();

    static JMenuBar menuBarCustomer = new JMenuBar();
    static JMenu menuReservationsCustomer = new JMenu("Reservations"),
                 menuRoomsCustomer = new JMenu("Rooms"),
                 menuUser = new JMenu("User");

    public static void showWelcomeCustomer(){
        createDefaultMenu(menuBarCustomer, menuReservationsCustomer, menuRoomsCustomer);

        frameWelcome.setJMenuBar(menuBarCustomer);
        createDefaultFrame(frameWelcome);
    }


    public static void showWelcomeAdmin(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menuReservations = new JMenu("Reservations"),
              menuRooms = new JMenu("Rooms");

        createDefaultMenu(menuBar, menuReservations, menuRooms);
        menuRooms.add(iCheckAvailabilityRoom);
        menuRooms.add(iAddRoomToInventory);
        menuRooms.add(iEditRoomInInventory);
        menuRooms.add(iRemoveRoomFromInventory);

        iCheckAvailabilityRoom.addActionListener(menuActions);
        iAddRoomToInventory.addActionListener(menuActions);
        iEditRoomInInventory.addActionListener(menuActions);
        iRemoveRoomFromInventory.addActionListener(menuActions);

        frameWelcome.setJMenuBar(menuBar);
        createDefaultFrame(frameWelcome);
    }

    
    public static void createDefaultMenu(JMenuBar menuBar, JMenu menuReservations,
                                         JMenu menuRooms){
        menuUser.add(iSignOff);

        menuReservations.add(iMakeReservation);
        menuReservations.add(iModifyReservation);
        menuReservations.add(iCancelReservation);
        menuReservations.add(iHistoryReservation);

        menuRooms.add(iSearchAvailableRooms);
        menuRooms.add(iDetailsRooms);

        menuBar.add(menuReservations);
        menuBar.add(menuRooms);
        menuBar.add(menuUser);

        iSignOff.addActionListener(menuActions);
        iMakeReservation.addActionListener(menuActions);
        iModifyReservation.addActionListener(menuActions);
        iCancelReservation.addActionListener(menuActions);
        iHistoryReservation.addActionListener(menuActions);

        iSearchAvailableRooms.addActionListener(menuActions);
        iDetailsRooms.addActionListener(menuActions);
    }


    public static void createDefaultFrame(JFrame frame){
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void showMakeReservation(){
        frameDefault.setTitle("Make Reservation - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showModifyReservation(){
        frameDefault.setTitle("Modify Reservation - MyHotel");
        createDefaultFrame(frameDefault);
    }

    
    public static void showCancelReservation(){
        frameDefault.setTitle("Cancel Reservation - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showHistoryReservation(){
        frameDefault.setTitle("Reservations History - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showSearchAvalaibleRooms(){
        frameDefault.setTitle("Search Rooms - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showDetailRooms(){
        frameDefault.setTitle("Room Details - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showCheckAvailabilityRoom(){
        frameDefault.setTitle("Check Availability Room - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showAddRoomToInventory(){
        frameDefault.setTitle("Add Room - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showEditRoomInInventory(){
        frameDefault.setTitle("Edit Room - MyHotel");
        createDefaultFrame(frameDefault);
    }


    public static void showRemoveRoomFromInventory(){
        frameDefault.setTitle("Remove Room - MyHotel");
        createDefaultFrame(frameDefault);
    }
}
