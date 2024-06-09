import javax.swing.*;

public class WelcomeCustomer {
    private static MenuActionsCustomer menuActions = new MenuActionsCustomer();

    static JMenuItem iMakeReservation = new JMenuItem("Make a reservation..."),
                iModifyReservation = new JMenuItem("Modify reservation..."),
                iCancelReservation = new JMenuItem("Cancel reservation..."),
                iHistoryReservation = new JMenuItem("View Reservation History..."),

                iSearchAvailableRooms = new JMenuItem("Search Available Rooms..."),

                iSignOff = new JMenuItem("Sign Off...");
    
    static JFrame frameWelcome = new JFrame("Welcome - MyHotel"),
                  frameDefault = new JFrame();

    static JMenuBar menuBar = new JMenuBar();
    static JMenu menuReservations = new JMenu("Reservations"),
                 menuRooms = new JMenu("Rooms"),
                 menuUser = new JMenu("User");

    public static void showWelcome(){
        menuUser.add(iSignOff);

        menuReservations.add(iMakeReservation);
        menuReservations.add(iModifyReservation);
        menuReservations.add(iCancelReservation);
        menuReservations.add(iHistoryReservation);

        menuRooms.add(iSearchAvailableRooms);

        menuBar.add(menuReservations);
        menuBar.add(menuRooms);
        menuBar.add(menuUser);

        iSignOff.addActionListener(menuActions);
        iMakeReservation.addActionListener(menuActions);
        iModifyReservation.addActionListener(menuActions);
        iCancelReservation.addActionListener(menuActions);
        iHistoryReservation.addActionListener(menuActions);

        iSearchAvailableRooms.addActionListener(menuActions);

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
}
