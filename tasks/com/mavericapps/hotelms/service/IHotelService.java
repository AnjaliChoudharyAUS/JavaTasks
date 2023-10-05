package tasks.com.mavericapps.hotelms.service;


import tasks.com.mavericapps.hotelms.domain.Guest;
import tasks.com.mavericapps.hotelms.service.HotelServiceImpl;

public interface IHotelService  {



        Guest findGuestCheckedInRoom(int hotelId);
        int  guestCount();
        double earningToday();
        Guest[] findAllGuest();



    }

