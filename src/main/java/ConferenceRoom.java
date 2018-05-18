import java.util.ArrayList;

public class ConferenceRoom extends Room {
    private String title;
    private double dailyRate;


    public ConferenceRoom(int capacity, ArrayList guests, String title, double dailyRate){
        super(capacity, guests);
        this.title = title;
        this.dailyRate = dailyRate;
    }

    public String getRoomTitle() {
        return this.title;
    }

    public double getDailyRate() {
        return this.dailyRate;
    }
}
