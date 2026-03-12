public class UseCase3RoomInventory {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("===== CENTRALIZED ROOM INVENTORY =====");

        for (String room : inventory.getRoomAvailability().keySet()) {
            System.out.println(room + " : " + inventory.getRoomAvailability().get(room));
        }

        System.out.println("\nUpdating Deluxe to 3...\n");

        inventory.updateAvailability("Deluxe", 3);

        for (String room : inventory.getRoomAvailability().keySet()) {
            System.out.println(room + " : " + inventory.getRoomAvailability().get(room));
        }

    }
}