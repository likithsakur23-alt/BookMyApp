import java.util.ArrayList;
import java.util.List;

public class RoomSearchService {

    private List<String> availableRooms = new ArrayList<>();

    public RoomSearchService() {
        availableRooms.add("Single Room");
        availableRooms.add("Double Room");
        availableRooms.add("Suite Room");
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (String room : availableRooms) {
            System.out.println(room);
        }
    }
}