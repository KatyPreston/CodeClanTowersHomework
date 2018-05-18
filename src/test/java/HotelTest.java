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
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Hotel hotel;
    Room room;
    Room room2;
    ArrayList<Guest> guests3;

    @Before
    public void before(){
        guest = new Guest("Selene");
        guests = new ArrayList<>();
        guests.add(guest);

        bedroom = new Bedroom(1, guests, 6, BedroomType.SINGLE, 40.00);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom);

        guest2 = new Guest("Legolas");
        guest3 = new Guest("Gimli");
        guests2 = new ArrayList<>();
        guests2.add(guest2);
        guests2.add(guest3);

        conferenceRoom = new ConferenceRoom(4, guests2, "War Room", 50.00);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom);

        hotel = new Hotel(bedrooms, conferenceRooms);
        guests3 = new ArrayList<>();
        room = new Bedroom(1, guests3, 3, BedroomType.SINGLE, 40.00);
        room2 = new ConferenceRoom(6, guests2, "Consultation Room", 30.00);
    }

    @Test
    public void canGetBedroomCount(){
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canGetConferenceRoomCount(){
        assertEquals(1, hotel.conferenceRoomCount());
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

}
