import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinalProject {
    public static Scanner inputKeyboard = new Scanner(System.in);
    public static List<User> users = new ArrayList<>();
    
    public static void main(String[] args) {
        showMenuLoginRegister();
    }

    public static void showMenuLoginRegister() {
        String email, password;
        boolean showMenu = true;

        while (showMenu) {
            System.out.println("Welcome to MyHotel...");
            System.out.println("More than a place to rest.");
            System.out.println("----------------------------------------------");
            System.out.println("Enter the desired option.");
            System.out.println("1. Register as a customer.");
            System.out.println("2. Log in.");
            System.out.println("3. Exit.");

            int option = inputKeyboard.nextInt();
            inputKeyboard.nextLine();

            switch (option) {
                case 1:
                    requestRegistrationData();
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Email: ");
                        email = inputKeyboard.nextLine();
                        System.out.print("Password: ");
                        password = inputKeyboard.nextLine();
                        if (logIn(email, password)) {
                            System.out.println("User log in correctly.\n");
                            break;
                        }
                        System.out.println("User incorrect, try one more time.\n");
                        if (i == 2) {
                            System.out.println("You have exceeded the maximum number of attempts. Bye bye.");
                            showMenu = false;
                        }
                    }
                    break;
                case 3:
                    System.out.println("See you soon!");
                    showMenu = false;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }
        }
    }

    public static void requestRegistrationData() {
        String identificationType, identificationNumber, names, surnames, email, Adress,
        cityResidence, cellphoneNumber, password, confirmPassword;

        System.out.println("----------------------------------------------");
        System.out.println("Formulario de registro");
        System.out.println("Para completar el registro, por favor facilitar la siguiente información:");
        System.out.println("----------------------------------------------");
        System.out.print("Identification type: ");
        identificationType = inputKeyboard.nextLine();
        System.out.print("ID number: ");
        identificationNumber = inputKeyboard.nextLine();
        System.out.print("Names: ");
        names = inputKeyboard.nextLine();
        System.out.print("Surnames: ");
        surnames = inputKeyboard.nextLine();
        System.out.print("Email: ");
        email = inputKeyboard.nextLine();
        System.out.print("Residence Adress: ");
        Adress = inputKeyboard.nextLine();
        System.out.print("City Residence: ");
        cityResidence = inputKeyboard.nextLine();
        System.out.print("Telephone Number: ");
        cellphoneNumber = inputKeyboard.nextLine();

        boolean notMatchPasswords = true;
        do {
            System.out.print("Password: ");
            password = inputKeyboard.nextLine();
            System.out.print("Confirm Password: ");
            confirmPassword = inputKeyboard.nextLine();

            if (!(password.equals(confirmPassword))) {
                System.out.println("The passwords do not match, please try again.\n");
            }
            else {notMatchPasswords = false;}
        } while (notMatchPasswords);

        registerUser(identificationType, identificationNumber, names, surnames,
        email, Adress, cityResidence, cellphoneNumber, password, confirmPassword);
    }

    public static void registerUser(String identificationType, String identificationNumber, String names,
    String surnames, String email, String residenceAdress, String cityResidence,  String telephoneNumber,
    String password, String confirmPassword) {

        User user = new User(identificationType, identificationNumber, names, surnames,
        email, residenceAdress, cityResidence, telephoneNumber, password, confirmPassword);
        users.add(user);
    }
    
    public static boolean logIn(String email, String password) {
        for (User user : users) {
            if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
