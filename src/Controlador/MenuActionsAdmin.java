import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

public class MenuActionsAdmin implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == WelcomeAdmin.iCheckRooms){
            RoomDAO.setModel((DefaultTableModel) CheckRooms.tCheckRooms.getModel());
            RoomDAO.emptyTable();
            checkRooms();
            CheckRooms.showCheckRooms();
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

    private void checkRooms(){
        RoomDAO roomDAO = new RoomDAO();
        List<Room> listRoom = roomDAO.roomList();
        Object[] obj = new Object[3];
        if (roomDAO.getModel().getColumnCount() == 0){
            roomDAO.getModel().addColumn("NUMBER");
            roomDAO.getModel().addColumn("CAPACITY");
            roomDAO.getModel().addColumn("PRICE NIGHT");
        }
        for (int i = 0; i < listRoom.size(); i++) {
            obj[0] = listRoom.get(i).getNumber();
            obj[1] = listRoom.get(i).getCapacity();
            obj[2] = listRoom.get(i).getPriceNight();
            roomDAO.getModel().addRow(obj);
        }
        CheckRooms.tCheckRooms.setModel(roomDAO.getModel());
    }
}   