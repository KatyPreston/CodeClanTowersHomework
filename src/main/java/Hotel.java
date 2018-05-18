import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> allRooms;

    public Hotel(ArrayList<Room> allRooms){
        this.allRooms = allRooms;
    }


    public int roomCount(){
        return this.allRooms.size();
    }


    public void checkInGuest(Guest guest, Room room){
        room.addGuest(guest);
    }

    public void checkOutGuest(Guest guest, Room room){
        room.removeGuest(guest);
    }

    public ArrayList<String> listGuests(Room room){
        ArrayList<String> guestNames = new ArrayList<>();
        for(Guest guest : room.getListOfGuests()){
            guestNames.add(guest.getName());
        }
        return guestNames;
    }
}
