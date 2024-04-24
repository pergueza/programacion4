public class FinalProject {
    public static void main(String[] args) {
        Admin admin = new Admin("C.C.",
                                "1006294360", "David",
                                "Pergueza Amaya",
                                "d.pergueza@utp.edu.co",
                                "Calle 5 #16-175", "Cartago",
                                "3168131975", "1204",
                                "1204");
        User.users.add(admin);

        MainMenu.showMainMenu();
    }
}