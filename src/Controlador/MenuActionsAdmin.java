import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;

public class MenuActionsAdmin implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == WelcomeAdmin.iCheckRooms){
            CheckRooms.emptyTable();
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
        CheckRooms.model = (DefaultTableModel) CheckRooms.jt.getModel();
        List<Room> listRoom = roomDAO.roomList();
        Object[] obj = new Object[3];
        if (CheckRooms.model.getColumnCount() == 0){
            CheckRooms.model.addColumn("NUMBER");
            CheckRooms.model.addColumn("CAPACITY");
            CheckRooms.model.addColumn("PRICE NIGHT");
        }
        for (int i = 0; i < listRoom.size(); i++) {
            obj[0] = listRoom.get(i).getNumber();
            obj[1] = listRoom.get(i).getCapacity();
            obj[2] = listRoom.get(i).getPriceNight();
            CheckRooms.model.addRow(obj);
        }
        CheckRooms.jt.setModel(CheckRooms.model);
    }
}   