package tasks.task4;

public class HotelService {

    String name;
    Room [] rooms = {new Room(101, 1, (new Guest(10101, "Anjali", "Choudhary", "Emailtoanjalichoudhary")), "Deluxe", 4599),
                     new Room(203, 2, (new Guest(20103, "Prasun", "Verma", "prasunverma12")), "deluxe", 4599),
                     new Room(405,4, (new Guest(40105, "Richa","Choudhary", "richamanchan4")), "deluxe", 4599),
            new Room(309, 3 , (new Guest(30109,"Aayush", "Chaturvedi","aayushchaturvedi09")),"Normal", 3900)
};

    void findGuestCheckedInRoom(int roomId) {

    }

    int guestsCount(){

    }
    double earningToday() {

    }; // add prices of rooms where guest is staying
    Guest[] findAllGuests();
}
