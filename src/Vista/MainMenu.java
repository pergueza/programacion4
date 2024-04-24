import javax.swing.*;

public class MainMenu {
    private static MainMenu instance;
    public static ButtonActions buttonActions = new ButtonActions();

    static JFrame fLogin = new JFrame("Login - MyHotel");
    static JTextField tfEmail = new JTextField();
    static JPasswordField pfPassword = new JPasswordField();

    static JButton bLogIn = new JButton("Log In"),
                   bRegisterCustomer  = new JButton("Register as a customer"),
                   bExit = new JButton("Exit");

    private MainMenu(){
        JLabel lPassword = new JLabel("Password");
        JLabel lEmail = new JLabel("Email");
        
        lEmail.setBounds(50, 30, 200, 30);
        tfEmail.setBounds(50, 60, 200, 30);
        lPassword.setBounds(50, 100, 200, 30);
        pfPassword.setBounds(50, 130, 200, 30);
        bLogIn.setBounds(50, 180, 200, 30);
        bRegisterCustomer.setBounds(50, 220, 200, 30);
        bExit.setBounds(50, 260, 200, 30);

        bLogIn.addActionListener(buttonActions);
        bRegisterCustomer.addActionListener(buttonActions);
        bExit.addActionListener(buttonActions);

        fLogin.add(lPassword); fLogin.add(lEmail);
        fLogin.add(tfEmail); fLogin.add(pfPassword);
        fLogin.add(bLogIn); fLogin.add(bRegisterCustomer); fLogin.add(bExit);
        fLogin.setSize(300, 370);
        fLogin.setLayout(null);
        fLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static MainMenu getInstance(){
        if (instance == null) {
            return instance = new MainMenu();
        }
        return instance;
    }

    public static void showMainMenu(){
        getInstance();
        fLogin.setVisible(true);
    }
    
    public static void closeMainMenu(){
        tfEmail.setText(null);
        pfPassword.setText(null);
        fLogin.setVisible(false);
    }
}
