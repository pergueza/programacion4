public class Room {
    private String id;
    private String id_admin;
    private String number;
    private String capacity;
    private String priceNight;

    public Room(){

    }

    public Room(String id, String id_admin, String name, String capacity, String priceNight) {
        this.id = id;
        this.id_admin = id_admin;
        this.number = name;
        this.capacity = capacity;
        this.priceNight = priceNight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String name) {
        this.number = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPriceNight() {
        return priceNight;
    }

    public void setPriceNight(String priceNight) {
        this.priceNight = priceNight;
    }    
}
