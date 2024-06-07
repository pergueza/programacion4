public class Room {
    private String id;
    private String id_admin;
    private String name;
    private String capacity;
    private String priceNight;
    private Boolean availability;

    public Room(){

    }

    public Room(String id, String id_admin, String name, String capacity, String priceNight, Boolean availability) {
        this.id = id;
        this.id_admin = id_admin;
        this.name = name;
        this.capacity = capacity;
        this.priceNight = priceNight;
        this.availability = availability;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }


    
}
