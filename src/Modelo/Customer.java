public class Customer extends User{

    public Customer(String identificationType, String identificationNumber,
                    String names, String surnames, String email,
                    String adress, String cityResidence, String cellphoneNumber,
                    String password, String confirmPassword) {
        super(identificationType, identificationNumber, names, surnames, email,
              adress, cityResidence, cellphoneNumber, password, confirmPassword);
    }

    public static void registerCustomer(String identificationType,
                                        String identificationNumber,
                                        String names, String surnames, String email,
                                        String Adress, String cityResidence,
                                        String cellphoneNumber, String password,
                                        String confirmPassword) {

        Customer customer = new Customer(identificationType, identificationNumber,
                                         names, surnames, email, Adress,
                                         cityResidence, cellphoneNumber, password,
                                         confirmPassword);
        customer.addUser();
    }
}
