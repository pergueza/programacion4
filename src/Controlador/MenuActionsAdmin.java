import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuActionsAdmin implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == WelcomeAdmin.iCheckAvailabilityRoom){
            WelcomeAdmin.showCheckAvailabilityRoom();
        }

        else if (e.getSource() == WelcomeAdmin.iAddRoomToInventory){
            AddRoom.showAddRoom();
        }

        else if (e.getSource() == WelcomeAdmin.iEditRoomInInventory){
            WelcomeAdmin.showEditRoomInInventory();
        }

        else if (e.getSource() == WelcomeAdmin.iRemoveRoomFromInventory){
            WelcomeAdmin.showRemoveRoomFromInventory();
        }

        else if (e.getSource() == WelcomeAdmin.iSignOff){
            WelcomeAdmin.frameWelcome.dispose();
            MainMenu.showMainMenu();
        }
    }
}   