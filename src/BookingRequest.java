public class BookingRequest {

    private String customerName;
    private String roomType;

    public BookingRequest(String customerName, String roomType) {
        this.customerName = customerName;
        this.roomType = roomType;
    }

    public void displayRequest() {
        System.out.println("Booking Request");
        System.out.println("Customer: " + customerName);
        System.out.println("Requested Room: " + roomType);
    }
}