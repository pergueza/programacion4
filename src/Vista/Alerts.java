import javax.swing.*;

public class Alerts extends JOptionPane{
    public static void emptyEmailField(JFrame frame){
        showMessageDialog(frame, "The Email can't be empty", null, ERROR_MESSAGE);
    }

    public static void emptyPasswordField(JFrame frame){
        showMessageDialog(frame, "The password can't be empty", null, ERROR_MESSAGE);
    }

    public static void errorLogin(JFrame frame){
        showMessageDialog(frame, "User or password incorrect", null, ERROR_MESSAGE);
    }

    public static void registerSuccess(JFrame frame){
        showMessageDialog(frame, "Registered Successfully", null,
        INFORMATION_MESSAGE);
    }

    public static void alreadyExist(JFrame frame){
        showMessageDialog(frame, "This user is already exist", null, ERROR_MESSAGE);
    }

    public static void notMatchPasswords(JFrame frame){
        showMessageDialog(frame, "The passwords do not match", null, ERROR_MESSAGE);
    }
}
