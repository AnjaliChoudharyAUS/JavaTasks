package tasks.task4;

public class Room {

    int roomNumber;
    int floor;
    Guest checkedIn;
    String roomType; // deluxe or normal
    double pricePerDay;

    public Room(int roomNumber, int floor, Guest checkedIn, String roomType, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.checkedIn = checkedIn;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
    }
}
