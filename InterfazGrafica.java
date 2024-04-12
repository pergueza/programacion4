import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class InterfazGrafica implements ActionListener{
    JFrame fLogin, fRegister;
    JDialog dialog;
    JTextField tfEmail;
    JPasswordField pfPassword;
    JButton bLogIn, bClose, bShowRegister, bRegister;
    
    InterfazGrafica(){
        fLogin = new JFrame("Log In");
        JLabel lPassword = new JLabel("Password");
        JLabel lEmail = new JLabel("Email");
        tfEmail = new JTextField();
        pfPassword = new JPasswordField();
        bLogIn = new JButton("Log In");
        bShowRegister = new JButton("Register as a customer");
        
        lEmail.setBounds(50, 30, 200, 30);
        tfEmail.setBounds(50, 60, 200, 30);
        lPassword.setBounds(50, 100, 200, 30);
        pfPassword.setBounds(50, 130, 200, 30);
        bLogIn.setBounds(50, 170, 200, 30);
        bLogIn.addActionListener(this);
        bShowRegister.setBounds(50, 210, 200, 30);
        bShowRegister.addActionListener(this);

        fLogin.add(lPassword); fLogin.add(lEmail);
        fLogin.add(tfEmail); fLogin.add(pfPassword);
        fLogin.add(bLogIn);
        fLogin.setSize(370, 280);
        fLogin.setLayout(null);
        fLogin.setVisible(true);
        fLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

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
            showRegister();
        }

        else if (e.getSource() == bClose) {
            dialog.setVisible(false);
            fRegister.setVisible(false);
        }
    }

    public void showWelcome(){
        JFrame frame = new JFrame("Welcome");
        JLabel lWelcome = new JLabel("Welcome to MyHotel.");

        lWelcome.setBounds(50, 100, 100, 30);

        frame.add(lWelcome);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void showMessage(JFrame frame, String message){
        dialog = new JDialog(frame);
        dialog.setLayout(new FlowLayout());
        JLabel lMessage = new JLabel(message);
        bClose = new JButton("Ok");
        bClose.addActionListener(this);

        dialog.add(lMessage);
        dialog.add(bClose);
        dialog.setSize(400, 100);
        dialog.setVisible(true);
    }

    public void showRegister(){
        fRegister = new JFrame("Register");
        JLabel identificationType = new JLabel("Identification type");
        JLabel identificatorNumber = new JLabel("ID number");
        JLabel names = new JLabel("Names");
        JLabel surnames = new JLabel("Surnames");
        JLabel email = new JLabel("Email");
        JLabel residenceAdress = new JLabel("Residence adress");
        JLabel cityResidence = new JLabel("City Residence");
        JLabel cellphoneNumber = new JLabel("Cellphone Number");
        JLabel password = new JLabel("Password");
        JLabel confirmPassword = new JLabel("confirm password");
    }
    public static void main(String[] args) {
        new InterfazGrafica();
    }
}
