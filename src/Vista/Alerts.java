import javax.swing.*;

public class Alerts extends JOptionPane{
    public static void emptyField(JFrame frame){
        showMessageDialog(frame, "Field can't be empty", null, ERROR_MESSAGE);
    }

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
    
    public static void notMatchPasswords(JFrame frame){
        showMessageDialog(frame, "The passwords do not match", null, ERROR_MESSAGE);
    }

    public static void idAlreadyExist(JFrame frame){
        showMessageDialog(frame, "The ID number is already in use", null, ERROR_MESSAGE);
    }

    public static void emailAlreadyExist(JFrame frame){
        showMessageDialog(frame, "This email is already in use", null, ERROR_MESSAGE);
    }

    public static void roomAlreadyExist(JFrame frame){
        showMessageDialog(frame, "This room is already exist", null, ERROR_MESSAGE);
    }

    public static void roomNotExist(JFrame frame){
        showMessageDialog(frame, "This room not exist", null, ERROR_MESSAGE);
    }

    public static void addRoomSuccess(JFrame frame){
        showMessageDialog(frame, "Add Room Correctly", null,
        INFORMATION_MESSAGE);
    }

    public static void editRoomSuccess(JFrame frame){
        showMessageDialog(frame, "Edit Room Correctly", null,
        INFORMATION_MESSAGE);
    }

    public static void removeRoomSuccess(JFrame frame){
        showMessageDialog(frame, "Remove Room Correctly", null,
        INFORMATION_MESSAGE);
    }
}
