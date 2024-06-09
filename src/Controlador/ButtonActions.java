import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonActions implements ActionListener{
    static User user = new User();
    UserDAO userDAO = new UserDAO();
    AdminDAO adminDAO = new AdminDAO();
    Room room = new Room();
    RoomDAO roomDAO = new RoomDAO();
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == MainMenu.bLogIn){
            buttonLogin();
        }

        else if (e.getSource() == MainMenu.bRegisterCustomer){
            Register.showRegister();
        }
        
        else if (e.getSource() == Register.bRegister){
            buttonRegister();
        }

        else if (e.getSource() == AddRoom.bAddRoom){
            buttonAddRoom();
        }

        else if (e.getSource() == EditRoom.bEditRoom){
            buttonEditRoom();
        }

        else if (e.getSource() == RemoveRoom.bRemoveRoom){
            buttonRemoveRoom();
        }

        else if (e.getSource() == MainMenu.bExit){
            System.exit(0);
        }


        else if (e.getSource() == Register.bBack){
            Register.closerRegister();
        }

        else if (e.getSource() == AddRoom.bBack){
            AddRoom.closeAddRoom();
        }

        else if (e.getSource() == RemoveRoom.bBack){
            RemoveRoom.closeRemoveRoom();
        }

        else if (e.getSource() == EditRoom.bBack){
            EditRoom.closeEditRoom();
        }
    }

    private void buttonLogin(){
        String email = MainMenu.tfEmail.getText();
        String password = String.valueOf(MainMenu.pfPassword.getPassword());
        if ("".equals(email)){
            Alerts.emptyEmailField(MainMenu.fLogin);
        }
        
        else if("".equals(password)){
            Alerts.emptyPasswordField(MainMenu.fLogin);
        }

        else{
            user = userDAO.logInUser(email, password);
            if (user.getEmail()!=null || user.getPassword()!=null) {
                if (user.getId_customer()!=null) {
                    MainMenu.closeMainMenu();
                    WelcomeCustomer.showWelcome();
                }
                else{
                    MainMenu.closeMainMenu();
                    WelcomeAdmin.showWelcome();
                }
            }
            else{
                Alerts.errorLogin(MainMenu.fLogin);
            }
        }
    }


    private void buttonRegister(){
        if (Register.tfIdentificationNumber.getText().equals("")){
            Alerts.emptyIdField(Register.fRegister);
        }

        else if (Register.tfEmail.getText().equals("")){
            Alerts.emptyEmailField(Register.fRegister);
        }

        else if (String.valueOf(Register.pfPassword.getPassword()).equals("")) {
            Alerts.emptyPasswordField(Register.fRegister);
        }

        else if (!String.valueOf(Register.pfPassword.getPassword())
            .equals(String.valueOf(Register.pfConfirmPassword.getPassword()))){
                Alerts.notMatchPasswords(null);
            }

        else{
            register();
        }
    }
    
    private void register(){
        if (userDAO.userIdIsAlreadyExist(Register.tfIdentificationNumber.getText())) {
            Alerts.idAlreadyExist(Register.fRegister);
        }

        else if (userDAO.userEmailIsAlreadyExist(Register.tfEmail.getText())) {
            Alerts.emailAlreadyExist(Register.fRegister);
        }
        
        else{
            user.setIdentificationType(Register.tfIdentificationType.getText());
            user.setIdentificationNumber(Register.tfIdentificationNumber.getText());
            user.setNames(Register.tfNames.getText());
            user.setSurnames(Register.tfSurnames.getText());
            user.setEmail(Register.tfEmail.getText());
            user.setAdress(Register.tfAdress.getText());
            user.setCityResidence(Register.tfCityResidence.getText());
            user.setCellphoneNumber(Register.tfCellphoneNumber.getText());
            user.setPassword(String.valueOf(Register.pfPassword.getPassword()));

            userDAO.signUpUser(user);
            Register.closerRegister();
            Alerts.registerSuccess(Register.fRegister);
        }
    }

    private void buttonAddRoom(){
        if (AddRoom.tfNumber.getText().equals("") || AddRoom.tfCapacity.getText().equals("") ||
            AddRoom.tfPriceNight.getText().equals("")){
                Alerts.emptyField(AddRoom.fAddRoom);
            }
        else{
            addRoom();
        }
    }

    private void addRoom(){
        Room room = new Room();
        
        if (roomDAO.roomIsAlreadyExist(AddRoom.tfNumber.getText())){
            Alerts.roomAlreadyExist(AddRoom.fAddRoom);
        }

        else{
            room.setNumber(AddRoom.tfNumber.getText());
            room.setCapacity(AddRoom.tfCapacity.getText());
            room.setPriceNight(AddRoom.tfPriceNight.getText());

            adminDAO.addRoomToInventory(user.getId_admin(), room);
            Alerts.addRoomSuccess(AddRoom.fAddRoom);
            AddRoom.closeAddRoom();
        }
    }

    private void buttonRemoveRoom(){
        if (!roomDAO.roomIsAlreadyExist(RemoveRoom.tfNumber.getText())) {
            Alerts.roomNotExist(RemoveRoom.fRemoveRoom);
        }

        else{
            adminDAO.removeRoomToInventory(RemoveRoom.tfNumber.getText());
            Alerts.removeRoomSuccess(RemoveRoom.fRemoveRoom);
            RemoveRoom.closeRemoveRoom();
        }
    }

    private void buttonEditRoom(){
        if (!roomDAO.roomIsAlreadyExist(EditRoom.tfNumber.getText())) {
            Alerts.roomNotExist(EditRoom.fEditRoom);
        }

        else{
            room.setNumber(EditRoom.tfNumber.getText());
            room.setCapacity(EditRoom.tfCapacity.getText());
            room.setPriceNight(EditRoom.tfPriceNight.getText());
            adminDAO.editRoom(room);
            Alerts.editRoomSuccess(EditRoom.fEditRoom);
            EditRoom.closeEditRoom();
        }
    }
}
