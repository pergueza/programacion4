import java.util.ArrayList;
import java.util.List;

public class FinalProject {
    public static List<User> users = new ArrayList<>();
    
    public static void main(String[] args) {
        showMenuLoginRegister();
    }

    public static void showMenuLoginRegister() {
        new InterfazGrafica();
    }

    public static void registerUser(String identificationType,
    String identificationNumber, String names, String surnames, String email,
    String Adress, String cityResidence,  String cellphoneNumber,
    String password, String confirmPassword) {

        User user = new User(identificationType, identificationNumber, names,
        surnames, email, Adress, cityResidence, cellphoneNumber, password,
        confirmPassword);
        
        users.add(user);
    }
    
    public static boolean logIn(String email, String password) {
        for (User user : users) {
            if (email.equals(user.getEmail()) &&
                password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
