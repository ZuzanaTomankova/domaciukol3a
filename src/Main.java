import com.engeto.ja.hotel.Booking;
import com.engeto.ja.hotel.Guest;
import com.engeto.ja.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan","Dvořáček", LocalDate.of(1995,5,5));

        List<Guest> otherGuests = new ArrayList<>();
        otherGuests.add(guest2);

        List <Guest> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);


        Room room1 = new Room(1,1,true,true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2,1,true,true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3,3,false,true, BigDecimal.valueOf(2400));

        Booking booking1 = new Booking(room1,guest1,null,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),true);
        Booking booking2 = new Booking(room3,guest1,otherGuests,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),true);

        List<Booking>bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);

        System.out.println("Rooms available:");
        System.out.println(room1+"Kč");
        System.out.println(room2+"Kč");
        System.out.println(room3+"Kč");

        bookingList.forEach(System.out::println);


    }
}