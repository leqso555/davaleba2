package Room;

public class Room {
    private int rooms;
    private String price;

    public Room(int rooms, String price) {
        this.rooms = rooms;
        this.price = price;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}


