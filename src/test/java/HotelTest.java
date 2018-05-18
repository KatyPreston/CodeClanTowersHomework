import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Guest guest;
    Guest guest2;
    Guest guest3;
    ArrayList<Guest> guests;
    ArrayList<Guest> guests2;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    ArrayList<Room> allRooms;
    Hotel hotel;
    Room room;
    Room room2;
    ArrayList<Guest> guests3;

    @Before
    public void before(){
        guest = new Guest("Selene");
        guests = new ArrayList<>();
        guests.add(guest);


        guest2 = new Guest("Legolas");
        guest3 = new Guest("Gimli");
        guests2 = new ArrayList<>();
        guests2.add(guest2);
        guests2.add(guest3);

        conferenceRoom = new ConferenceRoom(4, guests2, "War Room", 50.00);
        bedroom = new Bedroom(2, guests, 8, BedroomType.DOUBLE, 80.00);

        allRooms = new ArrayList<>();
        allRooms.add(conferenceRoom);
        allRooms.add(bedroom);
        guests3 = new ArrayList<>();
        room = new Bedroom(1, guests3, 3, BedroomType.SINGLE, 40.00);
        room2 = new ConferenceRoom(6, guests2, "Consultation Room", 30.00);

        hotel = new Hotel(allRooms);
    }


    @Test
    public void canGetRoomCount(){
        assertEquals(2, hotel.roomCount());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(guest, room);
        assertEquals(1, room.getGuestCount());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkOutGuest(guest2, room2);
        assertEquals(1, room2.getGuestCount());
    }

    @Test
    public void canGetListOfGuestsInARoom(){
        hotel.checkInGuest(guest2, room);
        hotel.checkInGuest(guest3, room);
        ArrayList<String> guestNames = new ArrayList<>();
        guestNames.add("Legolas");
        guestNames.add("Gimli");
        assertEquals(guestNames, hotel.listGuests(room));
    }

}
