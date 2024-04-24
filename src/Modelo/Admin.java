public class Admin extends User{

    public Admin(String identificationType, String identificationNumber,
                 String names, String surnames, String email, String adress,
                 String cityResidence, String cellphoneNumber, String password,
                 String confirmPassword) {
        super(identificationType, identificationNumber, names,
              surnames, email, adress, cityResidence,
              cellphoneNumber, password, confirmPassword);
    }

    
}
