import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class graphicInterface implements ActionListener{
    private JFrame fLogin, fRegister = new JFrame();
    private JDialog dialog;
    private JTextField tfEmail, tfIdentificationType, tfIdentificationNumber;
    private JTextField tfNames, tfSurnames, tfAdress, tfEmailRegister;
    private JTextField tfCityResidence, tfCellphoneNumber;
    private JPasswordField pfPassword, pfPasswordRegister, pfConfirmPassword;
    private JButton bLogIn, bCloseDialog, bShowRegister, bRegister, bExit, bBack;
    private Boolean registered = false;
    
    public void showLogin(){
        fLogin = new JFrame("Login - MyHotel");
        JLabel lPassword = new JLabel("Password");
        JLabel lEmail = new JLabel("Email");
        tfEmail = new JTextField();
        pfPassword = new JPasswordField();
        bLogIn = new JButton("Log In");
        bShowRegister = new JButton("Register as a customer");
        bExit = new JButton("Exit");
        
        lEmail.setBounds(50, 30, 200, 30);
        tfEmail.setBounds(50, 60, 200, 30);
        lPassword.setBounds(50, 100, 200, 30);
        pfPassword.setBounds(50, 130, 200, 30);
        bLogIn.setBounds(50, 180, 200, 30);
        bShowRegister.setBounds(50, 220, 200, 30);
        bExit.setBounds(50, 260, 200, 30);

        bLogIn.doClick(50);
        bLogIn.addActionListener(this);
        bShowRegister.addActionListener(this);
        bExit.addActionListener(this);

        fLogin.add(lPassword); fLogin.add(lEmail);
        fLogin.add(tfEmail); fLogin.add(pfPassword);
        fLogin.add(bLogIn); fLogin.add(bShowRegister); fLogin.add(bExit);
        fLogin.setSize(300, 370);
        fLogin.setLayout(null);
        fLogin.setVisible(true);
        fLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bLogIn){
            if(FinalProject.logIn(tfEmail.getText(),
                                  new String(pfPassword.getPassword()))){
                showWelcome();
            }
            else{
                showMessage(fLogin, "User or password it's incorrect");
            }
        }

        else if (e.getSource() == bShowRegister){
            showRegistrationData();
        }

        else if (e.getSource() == bRegister){
            if (new String(pfPasswordRegister.getPassword()
                            ).equals(new String(pfConfirmPassword.getPassword()))){
                                
                FinalProject.registerUser(
                    tfIdentificationType.getText(),
                    tfIdentificationNumber.getText(), tfNames.getText(),
                    tfSurnames.getText(), tfEmailRegister.getText(),
                    tfAdress.getText(), tfCityResidence.getText(),
                    tfCellphoneNumber.getText(),
                    new String(pfPasswordRegister.getPassword()),
                    new String(pfConfirmPassword.getPassword())
                );
                showMessage(fRegister, "Registered Successfully");
                registered = true;
            }
            else{
                showMessage(fRegister, "The passwords do not match");
            }
        }

        else if (e.getSource() == bCloseDialog) {
                dialog.setVisible(false);
                if (registered){
                    fRegister.setVisible(false);
                }
        }

        else if (e.getSource() == bBack){
            fRegister.setVisible(false);
        }

        else if (e.getSource() == bExit){
            System.exit(0);
        }
    }

    public void showWelcome(){
        JFrame frame = new JFrame("Welcome");
        JLabel lWelcome = new JLabel("Welcome to MyHotel.");

        lWelcome.setBounds(50, 100, 200, 30);

        frame.add(lWelcome);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void showMessage(JFrame frame, String message){
        dialog = new JDialog(frame);
        dialog.setLayout(new FlowLayout());
        JLabel lMessage = new JLabel(message);
        bCloseDialog = new JButton("Ok");
        bCloseDialog.addActionListener(this);

        dialog.add(lMessage);
        dialog.add(bCloseDialog);
        dialog.setSize(400, 100);
        dialog.setVisible(true);
    }

    public void showRegistrationData(){
        registered = false;
        fRegister = new JFrame("Register");
        JLabel lIdentificationType = new JLabel("Identification type");
        JLabel lIdentificationNumber = new JLabel("ID number");
        JLabel lNames = new JLabel("Names");
        JLabel lSurnames = new JLabel("Surnames");
        JLabel lEmail = new JLabel("Email");
        JLabel lAdress = new JLabel("Adress");
        JLabel lCityResidence = new JLabel("City Residence");
        JLabel lCellphoneNumber = new JLabel("Cellphone Number");
        JLabel lPasswordRegister = new JLabel("Password");
        JLabel lConfirmPassword = new JLabel("confirm password");
        tfIdentificationType = new JTextField();
        tfIdentificationNumber = new JTextField();
        tfNames = new JTextField();
        tfSurnames = new JTextField();
        tfEmailRegister = new JTextField();
        tfAdress = new JTextField();
        tfCityResidence = new JTextField();
        tfCellphoneNumber = new JTextField();
        pfPasswordRegister = new JPasswordField();
        pfConfirmPassword = new JPasswordField();
        bRegister = new JButton("Register");
        bBack = new JButton("Back");

        lIdentificationType.setBounds(50, 30, 140, 30);
        tfIdentificationType.setBounds(50, 60, 140, 30);
        lIdentificationNumber.setBounds(210, 30, 140, 30);
        tfIdentificationNumber.setBounds(210, 60, 140, 30);
        lNames.setBounds(50, 100, 140, 30);
        tfNames.setBounds(50, 130, 140, 30);
        lSurnames.setBounds(210, 100, 140, 30);
        tfSurnames.setBounds(210, 130, 140, 30);
        lEmail.setBounds(50, 170, 140, 30);
        tfEmailRegister.setBounds(50, 200, 140, 30);
        lAdress.setBounds(210, 170, 140, 30);
        tfAdress.setBounds(210, 200, 140, 30);
        lCityResidence.setBounds(50, 240, 140, 30);
        tfCityResidence.setBounds(50, 270, 140, 30);
        lCellphoneNumber.setBounds(210, 240, 140, 30);
        tfCellphoneNumber.setBounds(210, 270, 140, 30);
        lPasswordRegister.setBounds(50, 310, 140, 30);
        pfPasswordRegister.setBounds(50, 340, 140, 30);
        lConfirmPassword.setBounds(210, 310, 140, 30);
        pfConfirmPassword.setBounds(210, 340, 140, 30);
        bRegister.setBounds(50, 390, 140, 30);
        bBack.setBounds(210, 390, 140, 30);

        bRegister.addActionListener(this);
        bBack.addActionListener(this);

        fRegister.add(lIdentificationType); fRegister.add(tfIdentificationType);
        fRegister.add(lIdentificationNumber); fRegister.add(tfIdentificationNumber);
        fRegister.add(lNames); fRegister.add(tfNames);
        fRegister.add(lSurnames); fRegister.add(tfSurnames);
        fRegister.add(lEmail); fRegister.add(tfEmailRegister);
        fRegister.add(lAdress); fRegister.add(tfAdress);
        fRegister.add(lCityResidence); fRegister.add(tfCityResidence);
        fRegister.add(lCellphoneNumber); fRegister.add(tfCellphoneNumber);
        fRegister.add(lPasswordRegister); fRegister.add(pfPasswordRegister);
        fRegister.add(lConfirmPassword); fRegister.add(pfConfirmPassword);
        fRegister.add(bRegister); fRegister.add(bBack);
        fRegister.setSize(400, 500);
        fRegister.setLayout(null);
        fRegister.setVisible(true);
    }
}
