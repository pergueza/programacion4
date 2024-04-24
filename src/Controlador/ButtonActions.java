import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonActions implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == MainMenu.bLogIn){
            if (MainMenu.tfEmail.getText().equals("")){
                Alerts.emptyEmailField(MainMenu.fLogin);
            }

            else if (String.valueOf(MainMenu.pfPassword.getPassword()).equals("")) {
                Alerts.emptyPasswordField(MainMenu.fLogin);
            }

            else{
                buttonLogin();
            }
        }

        else if (e.getSource() == MainMenu.bRegisterCustomer){
            Register.showRegister();
        }

        else if (e.getSource() == MainMenu.bExit){
            System.exit(0);
        }

        else if (e.getSource() == Register.bRegister){
            if (Register.tfEmail.getText().equals("")){
                Alerts.emptyEmailField(Register.fRegister);
            }

            else if (String.valueOf(Register.pfPassword.getPassword()).equals("")) {
                Alerts.emptyPasswordField(Register.fRegister);
            }

            else{
                buttonRegister();
            }
        }

        else if (e.getSource() == Register.bBack){
            Register.closerRegister();
        }
    }


    private static void buttonLogin(){
        if (User.login(MainMenu.tfEmail.getText(),
            String.valueOf(MainMenu.pfPassword.getPassword())))
        {
            MainMenu.closeMainMenu();
            if (User.isCustomer){
                Welcome.showWelcomeCustomer();
            }

            else{
                Welcome.showWelcomeAdmin();
            }
        }

        else{
            Alerts.errorLogin(MainMenu.fLogin);
        }
    }


    private static void buttonRegister(){
        if (User.isAlreadyExist(Register.tfEmail.getText())) {
            Alerts.alreadyExist(Register.fRegister);
        }
        else if (String.valueOf(Register.pfPassword.getPassword())
                .equals(String.valueOf(Register.pfConfirmPassword.getPassword())))
            {
                Customer.registerCustomer(
                    Register.tfIdentificationType.getText(),
                    Register.tfIdentificationNumber.getText(),
                    Register.tfNames.getText(),
                    Register.tfSurnames.getText(),
                    Register.tfEmail.getText(),
                    Register.tfAdress.getText(),
                    Register.tfCityResidence.getText(),
                    Register.tfCellphoneNumber.getText(),
                    String.valueOf(Register.pfPassword.getPassword()),
                    String.valueOf(Register.pfConfirmPassword.getPassword())
                );
                Register.closerRegister();
                Alerts.registerSuccess(Register.fRegister);
            }

            else{
                Alerts.notMatchPasswords(Register.fRegister);
            }
    }
}
