import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuActionsAdmin implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == WelcomeAdmin.iCheckRooms){
            WelcomeAdmin.showCheckAvailabilityRoom();
        }

        else if (e.getSource() == WelcomeAdmin.iAddRoomToInventory){
            AddRoom.showAddRoom();
        }

        else if (e.getSource() == WelcomeAdmin.iEditRoomInInventory){
            EditRoom.showEditRoom();
        }

        else if (e.getSource() == WelcomeAdmin.iRemoveRoomFromInventory){
            RemoveRoom.showRemoveRoom();
        }

        else if (e.getSource() == WelcomeAdmin.iSignOff){
            WelcomeAdmin.frameWelcome.dispose();
            MainMenu.showMainMenu();
        }
    }
}   