public class InventoryManager {

    private int availableRooms = 10;

    public void bookRoom() {
        if(availableRooms > 0) {
            availableRooms--;
            System.out.println("Room booked. Remaining: " + availableRooms);
        } else {
            System.out.println("No rooms available.");
        }
    }

    public void cancelBooking() {
        availableRooms++;
        System.out.println("Booking cancelled. Rooms available: " + availableRooms);
    }
}