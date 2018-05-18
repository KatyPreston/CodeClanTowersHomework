import java.util.ArrayList;

public class Bedroom extends Room {
    private int roomNumber;
    private BedroomType type;
    private double nightlyRate;

    public Bedroom(int capacity, ArrayList guests, int roomNumber, BedroomType type, double nightlyRate){
        super(capacity, guests);
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }


    public int getRoomNumber(){
        return this.roomNumber;
    }

    public BedroomType getRoomType(){
        return this.type;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }
}
