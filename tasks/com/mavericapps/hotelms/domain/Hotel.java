package tasks.com.mavericapps.hotelms.domain;



public class Hotel {
    int hotelId;
    String name;
    public Room[] rooms;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Room[] getRooms() {
//        return rooms;
//    }
//
//    public void setRooms(Room[] rooms) {
//        this.rooms = rooms;
//    }

    public Hotel(String name, Room[] rooms, int hotelId) {
        this.name = name;
        this.rooms = rooms;
        this.hotelId=hotelId;
    }


}
