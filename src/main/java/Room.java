import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests){
        this.capacity = capacity;
        this.guests = guests;
    }



    public int getCapacity(){
        return this.capacity;
    }

    public int getGuestCount(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public ArrayList<Guest> getListOfGuests() {
       return new ArrayList<>(this.guests);
        }

}
