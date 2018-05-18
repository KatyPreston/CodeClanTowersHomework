import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest = new Guest("Chuck");
        guest2 = new Guest("Lisa");
        guests = new ArrayList<>();
        guests.add(guest);
        guests.add(guest2);

        conferenceRoom = new ConferenceRoom(10, guests, "Walter Tatley Room", 100.00);
    }


    @Test
    public void canGetCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetGuestCount(){
        assertEquals(2, conferenceRoom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        Guest guest3 = new Guest("Marge");
        conferenceRoom.addGuest(guest3);
        assertEquals(3, conferenceRoom.getGuestCount());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.removeGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void canGetRoomTitle(){
        assertEquals("Walter Tatley Room", conferenceRoom.getRoomTitle());
    }

    @Test
    public void canGetDailyRate(){
        assertEquals(100.00, conferenceRoom.getDailyRate(), 0.1);
    }
}


