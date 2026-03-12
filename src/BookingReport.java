import java.util.ArrayList;
import java.util.List;

public class BookingReport {

    private List<String> bookings = new ArrayList<>();

    public void addBooking(String booking) {
        bookings.add(booking);
    }

    public void generateReport() {
        System.out.println("\nBooking Report:");
        for(String b : bookings) {
            System.out.println(b);
        }
    }
}