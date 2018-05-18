import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList guests;

    public Room(int capacity, ArrayList guests){
        this.capacity = capacity;
        this.guests = guests;
    }



    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList getGuests(){
        return this.guests;
    }
}
