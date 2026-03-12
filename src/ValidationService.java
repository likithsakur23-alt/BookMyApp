public class ValidationService {

    public boolean validateBooking(String customerName, String roomType) {

        if(customerName == null || customerName.isEmpty()) {
            System.out.println("Error: Customer name cannot be empty.");
            return false;
        }

        if(roomType == null || roomType.isEmpty()) {
            System.out.println("Error: Room type required.");
            return false;
        }

        return true;
    }
}