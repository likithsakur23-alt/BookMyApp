public class ConcurrentBooking implements Runnable {

    private InventoryManager inventory;

    public ConcurrentBooking(InventoryManager inventory) {
        this.inventory = inventory;
    }

    public void run() {
        inventory.bookRoom();
    }
}