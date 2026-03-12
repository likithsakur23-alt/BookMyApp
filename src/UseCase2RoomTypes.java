public class UseCase2RoomTypes {

    public static void main(String[] args) {

        String[] roomTypes = {"Single", "Double", "Deluxe", "Suite"};
        int[] availability = {10, 8, 5, 2};

        System.out.println("===== ROOM TYPES & AVAILABILITY =====");

        for (int i = 0; i < roomTypes.length; i++) {
            System.out.println(roomTypes[i] + " Rooms Available: " + availability[i]);
        }

    }
}