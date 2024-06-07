import javax.swing.*;

public class Alerts extends JOptionPane{
    public static void emptyEmailField(JFrame frame){
        showMessageDialog(frame, "The Email can't be empty", null, ERROR_MESSAGE);
    }

    public static void emptyPasswordField(JFrame frame){
        showMessageDialog(frame, "The password can't be empty", null, ERROR_MESSAGE);
    }

    public static void emptyIdField(JFrame frame){
        showMessageDialog(frame, "The ID number can't be empty", null, ERROR_MESSAGE);
    }

    public static void errorLogin(JFrame frame){
        showMessageDialog(frame, "User or password incorrect", null, ERROR_MESSAGE);
    }

    public static void registerSuccess(JFrame frame){
        showMessageDialog(frame, "Registered Successfully", null,
        INFORMATION_MESSAGE);
    }

    public static void idAlreadyExist(JFrame frame){
        showMessageDialog(frame, "The ID number is already in use", null, ERROR_MESSAGE);
    }

    public static void notMatchPasswords(JFrame frame){
        showMessageDialog(frame, "The passwords do not match", null, ERROR_MESSAGE);
    }

    public static void emailAlreadyExist(JFrame frame){
        showMessageDialog(frame, "This email is already in use", null, ERROR_MESSAGE);
    }
}
