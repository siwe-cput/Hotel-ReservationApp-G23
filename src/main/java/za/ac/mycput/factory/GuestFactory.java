package za.ac.mycput.factory;
//*Author:'Andisiwe' 'Qhuva'
//* Student Number:218272510
//*Date 26 March 2024
//*https://github.com/siwe-cput/Hotel-ReservationApp-G23

import za.ac.mycput.domain.Guest;
import za.ac.mycput.domain.Reservation;
import za.ac.mycput.util.Helper;

public interface GuestFactory {

    public static GuestFactory buildReservation(Integer guestID, String guestName, String emailAddress, Integer roomNumber , String feedback) {

        if (Helper.isNullorEmpty(String.valueOf(guestID)) || Helper.isNullorEmpty(guestName)
                || Helper.isNullorEmpty(emailAddress) || Helper.isNullorEmpty(feedback)
                || Helper.isNullorEmpty(String.valueOf(roomNumber)))
            return null;


        return (GuestFactory) new Guest.Builder().Builder().setGuestID(guestID)
                .setStartDate(emailAddress)
                .setEndDate(feedback)
                .setGuestName(guestName)
                .setRoomNumber(roomNumber)
                .build();
    }
}










