import javax.swing.*;

public class Register {
    private static Register instance;
    static ButtonActions buttonActions = new ButtonActions();

    static JFrame fRegister = new JFrame("Register - MyHotel");
    
    static JButton bBack = new JButton("Back"),
    bRegister = new JButton("Register");
    
    static JTextField tfIdentificationType = new JTextField(),
    tfIdentificationNumber = new JTextField(),
    tfNames = new JTextField(),
    tfSurnames = new JTextField(),
    tfAdress = new JTextField(),
    tfEmail = new JTextField(),
    tfCityResidence = new JTextField(),
    tfCellphoneNumber = new JTextField();

    static JPasswordField pfPassword = new JPasswordField(),
                            pfConfirmPassword = new JPasswordField();
    
    private Register(){
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

        lIdentificationType.setBounds(50, 30, 140, 30);
        tfIdentificationType.setBounds(50, 60, 140, 30);
        lIdentificationNumber.setBounds(210, 30, 140, 30);
        tfIdentificationNumber.setBounds(210, 60, 140, 30);
        lNames.setBounds(50, 100, 140, 30);
        tfNames.setBounds(50, 130, 140, 30);
        lSurnames.setBounds(210, 100, 140, 30);
        tfSurnames.setBounds(210, 130, 140, 30);
        lEmail.setBounds(50, 170, 140, 30);
        tfEmail.setBounds(50, 200, 140, 30);
        lAdress.setBounds(210, 170, 140, 30);
        tfAdress.setBounds(210, 200, 140, 30);
        lCityResidence.setBounds(50, 240, 140, 30);
        tfCityResidence.setBounds(50, 270, 140, 30);
        lCellphoneNumber.setBounds(210, 240, 140, 30);
        tfCellphoneNumber.setBounds(210, 270, 140, 30);
        lPasswordRegister.setBounds(50, 310, 140, 30);
        pfPassword.setBounds(50, 340, 140, 30);
        lConfirmPassword.setBounds(210, 310, 140, 30);
        pfConfirmPassword.setBounds(210, 340, 140, 30);
        bRegister.setBounds(50, 390, 140, 30);
        bBack.setBounds(210, 390, 140, 30);

        bRegister.addActionListener(buttonActions);
        bBack.addActionListener(buttonActions);

        fRegister.add(lIdentificationType); fRegister.add(tfIdentificationType);
        fRegister.add(lIdentificationNumber); fRegister.add(tfIdentificationNumber);
        fRegister.add(lNames); fRegister.add(tfNames);
        fRegister.add(lSurnames); fRegister.add(tfSurnames);
        fRegister.add(lEmail); fRegister.add(tfEmail);
        fRegister.add(lAdress); fRegister.add(tfAdress);
        fRegister.add(lCityResidence); fRegister.add(tfCityResidence);
        fRegister.add(lCellphoneNumber); fRegister.add(tfCellphoneNumber);
        fRegister.add(lPasswordRegister); fRegister.add(pfPassword);
        fRegister.add(lConfirmPassword); fRegister.add(pfConfirmPassword);
        fRegister.add(bRegister); fRegister.add(bBack);
        fRegister.setSize(400, 500);
        fRegister.setLayout(null);
        fRegister.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private static Register getInstance(){
        if (instance == null){
            return instance = new Register();
        }
        return instance;
    }

    public static void showRegister(){
        getInstance();

        fRegister.setVisible(true);
    }

    public static void closerRegister(){
        tfAdress.setText(null);
        tfCellphoneNumber.setText(null);
        tfCityResidence.setText(null);
        tfEmail.setText(null);
        tfIdentificationNumber.setText(null);
        tfIdentificationType.setText(null);
        tfNames.setText(null);
        tfSurnames.setText(null);
        pfConfirmPassword.setText(null);
        pfPassword.setText(null);

        fRegister.setVisible(false);
    }
}
