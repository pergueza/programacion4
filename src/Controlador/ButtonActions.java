import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonActions implements ActionListener{
    
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
            buttonRegister();
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
        if (String.valueOf(Register.pfPasswordRegister.getPassword())
                .equals(String.valueOf(Register.pfConfirmPassword.getPassword())))
            {
                Customer.registerCustomer(
                    Register.tfIdentificationType.getText(),
                    Register.tfIdentificationNumber.getText(),
                    Register.tfNames.getText(),
                    Register.tfSurnames.getText(),
                    Register.tfEmailRegister.getText(),
                    Register.tfAdress.getText(),
                    Register.tfCityResidence.getText(),
                    Register.tfCellphoneNumber.getText(),
                    String.valueOf(Register.pfPasswordRegister.getPassword()),
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
