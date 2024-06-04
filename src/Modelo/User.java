import java.util.ArrayList;
import java.util.List;

public class User {
    String identificationType;
    String identificationNumber;
    String names;
    String surnames;
    String adress;
    String cityResidence;
    String cellphoneNumber;
    String confirmPassword;
    private String email;
    private String password;
    static boolean isCustomer;

    public static List<User> users = new ArrayList<>();


    public User(String identificationType, String identificationNumber,
                String names, String surnames, String email, String adress,
                String cityResidence, String cellphoneNumber, String password,
                String confirmPassword){
        
        this.identificationType = identificationType;
        this.identificationNumber = identificationNumber;
        this.names = names;
        this.surnames = surnames;
        this.email = email;
        this.adress = adress;
        this.cityResidence = cityResidence;
        this.cellphoneNumber = cellphoneNumber;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public static boolean login(String email, String password) {
        for (User user : User.users) {
            if (email.equals(user.getEmail()) &&
                password.equals(user.getPassword())) {
                    if (user instanceof Customer){
                        isCustomer = true;
                    }
                    else{
                        isCustomer = false;
                    }
                    return true;
            }
        }
        return false;
    }

    public static boolean isAlreadyExist(String email){
        for (User user : User.users) {
            if (email.equals(user.getEmail())){
                return true;
            }
        }
        return false;
    }

    public String getEmail(){
        return this.email;
    }


    public String getPassword(){
        return this.password;
    }


    public void register(){
        users.add(this);
    }
}
