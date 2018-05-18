import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Guest guest;
    Bedroom bedroom;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest = new Guest("Antoin");
        guests = new ArrayList();
        bedroom = new Bedroom(2, guests , 1, BedroomType.DOUBLE, 80.00);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetGuestCount(){
        guests.add(guest);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(BedroomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canGetNightlyRate(){
        assertEquals(80.00, bedroom.getNightlyRate(), 0.1);
    }
}
