import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonActions implements ActionListener{
    User user = new User();
    UserDAO userDAO = new UserDAO();
    
    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == MainMenu.bLogIn){
            buttonLogin();
        }

        else if (e.getSource() == MainMenu.bRegisterCustomer){
            Register.showRegister();
        }

        else if (e.getSource() == MainMenu.bExit){
            System.exit(0);
        }

        else if (e.getSource() == Register.bRegister){
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
                buttonRegister();
            }
        }

        else if (e.getSource() == Register.bBack){
            Register.closerRegister();
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
                if (user.getIsCustomer()!=null) {
                    WelcomeCustomer.showWelcome();
                }
                else{
                    WelcomeAdmin.showWelcome();
                }
            }
            else{
                Alerts.errorLogin(MainMenu.fLogin);
            }
        }
    }


    private void buttonRegister(){
        if (userDAO.isAlreadyExist(Register.tfIdentificationNumber.toString())) {
            Alerts.alreadyExist(Register.fRegister);
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
}
