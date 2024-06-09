import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuActionsCustomer implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == WelcomeCustomer.iMakeReservation){
            WelcomeCustomer.showMakeReservation();
        }

        else if (e.getSource() == WelcomeCustomer.iModifyReservation){
            WelcomeCustomer.showModifyReservation();
        }

        else if (e.getSource() == WelcomeCustomer.iCancelReservation){
            WelcomeCustomer.showCancelReservation();
        }

        else if (e.getSource() == WelcomeCustomer.iHistoryReservation){
            WelcomeCustomer.showHistoryReservation();
        }

        else if (e.getSource() == WelcomeCustomer.iSearchAvailableRooms){
            WelcomeCustomer.showSearchAvalaibleRooms();
        }

        else if (e.getSource() == WelcomeCustomer.iSignOff){
            WelcomeCustomer.frameWelcome.dispose();
            MainMenu.showMainMenu();
        }
    }
}
