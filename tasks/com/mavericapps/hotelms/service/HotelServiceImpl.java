package tasks.com.mavericapps.hotelms.service;

import tasks.com.mavericapps.hotelms.domain.*;
import tasks.com.mavericapps.hotelms.domain.Room;

public class HotelServiceImpl implements IHotelService{

        public Guest findGuestCheckedInRoom(int hotelId) {
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].roomNo == roomId) {
                    return rooms[i].checkedIn;
                }
            }
            return null;
        }


       public int guestsCount() {
            int count = 0;
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].checkedIn != null) {
                    count++;
                }
            }
            return count;
        }

        public double earningToday(){       // add prices of rooms where guest is staying
            double totalEarning = 0;
            for (int i = 0; i < rooms.length; i++) {
                if(rooms[i].checkedIn != null){
                    totalEarning = totalEarning + rooms[i].pricePerDay;
                }
            }
            return totalEarning;
        }

        public Guest[] findAllGuest(){
            Guest[] allGuest = new Guest[4];
            int Index = 0;
            for (int i = 0; i < rooms.length; i++) {
                if(rooms[i].checkedIn != null){
                    allGuest[Index]=rooms[i].checkedIn;
                    Index++;
                }
            }
            return allGuest;
        }

}

