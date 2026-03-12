public class Reservation {

    private String customerName;
    private String allocatedRoom;

    public Reservation(String customerName, String allocatedRoom) {
        this.customerName = customerName;
        this.allocatedRoom = allocatedRoom;
    }

    public void confirmReservation() {
        System.out.println("Reservation Confirmed!");
        System.out.println("Customer: " + customerName);
        System.out.println("Allocated Room: " + allocatedRoom);
    }
}