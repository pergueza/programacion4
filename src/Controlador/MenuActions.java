import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuActions implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Welcome.iMakeReservation){
            Welcome.showMakeReservation();
        }

        else if (e.getSource() == Welcome.iModifyReservation){
            Welcome.showModifyReservation();
        }

        else if (e.getSource() == Welcome.iCancelReservation){
            Welcome.showCancelReservation();
        }

        else if (e.getSource() == Welcome.iHistoryReservation){
            Welcome.showHistoryReservation();
        }

        else if (e.getSource() == Welcome.iSearchAvailableRooms){
            Welcome.showSearchAvalaibleRooms();
        }

        else if (e.getSource() == Welcome.iDetailsRooms){
            Welcome.showDetailRooms();
        }

        else if (e.getSource() == Welcome.iCheckAvailabilityRoom){
            Welcome.showCheckAvailabilityRoom();
        }

        else if (e.getSource() == Welcome.iAddRoomToInventory){
            Welcome.showAddRoomToInventory();
        }

        else if (e.getSource() == Welcome.iEditRoomInInventory){
            Welcome.showEditRoomInInventory();
        }

        else if (e.getSource() == Welcome.iRemoveRoomFromInventory){
            Welcome.showRemoveRoomFromInventory();
        }

        else if (e.getSource() == Welcome.iSignOff){
            Welcome.frameWelcome.dispose();
            MainMenu.showMainMenu();
        }
    }
}
