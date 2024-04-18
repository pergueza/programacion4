import java.util.ArrayList;
import java.util.List;

public class FinalProject {
    public static List<User> users = new ArrayList<>();
    public static GraphicInterface interfazGrafica = new GraphicInterface();
    
    public static void main(String[] args) {
        interfazGrafica.showLogin();
    }

    public static void showMenuLoginRegister() {
        new GraphicInterface();
    }

    public static void registerCustomer(String identificationType,
    String identificationNumber, String names, String surnames, String email,
    String Adress, String cityResidence,  String cellphoneNumber,
    String password, String confirmPassword) {

        Customer customer = new Customer(identificationType, identificationNumber, names,
        surnames, email, Adress, cityResidence, cellphoneNumber, password,
        confirmPassword);
        
        users.add(customer);
    }
    
    public static boolean login(String email, String password) {
        for (User user : users) {
            if (email.equals(user.getEmail()) &&
                password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
