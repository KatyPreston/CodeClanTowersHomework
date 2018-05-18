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
}
