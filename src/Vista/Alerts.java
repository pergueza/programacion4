import javax.swing.*;

public class Alerts {
    public static void errorLogin(JFrame frame){
        JOptionPane.showMessageDialog(frame, "User or password incorrect",
        null, JOptionPane.ERROR_MESSAGE);
    }

    public static void registerSuccess(JFrame frame){
        JOptionPane.showMessageDialog(frame, "Registered Successfully", null,
        JOptionPane.INFORMATION_MESSAGE);
    }

    public static void notMatchPasswords(JFrame frame){
        JOptionPane.showMessageDialog(frame, "The passwords do not match", null,
        JOptionPane.ERROR_MESSAGE);
    }
}
