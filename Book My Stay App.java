import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}
abstract class Room {
    public abstract void displayRoomDetails();
}
class SingleRoom extends Room {
    public void displayRoomDetails() {
        System.out.println("Type: Single Room");
        System.out.println("Bed: 1 Bed");
        System.out.println("Price: ₹1000 per night");
    }
}
class DoubleRoom extends Room {
    public void displayRoomDetails() {
        System.out.println("Type: Double Room");
        System.out.println("Bed: 2 Beds");
        System.out.println("Price: ₹2000 per night");
    }
}
class SuiteRoom extends Room {
    public void displayRoomDetails() {
        System.out.println("Type: Suite Room");
        System.out.println("Bed: King Size Bed");
        System.out.println("Price: ₹5000 per night");
    }
}
public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Hotel Room Inventory Status\n");

        RoomInventory inventory = new RoomInventory();

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available Rooms: " + availability.get("Single"));

        System.out.println();

        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + availability.get("Double"));

        System.out.println();

        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: " + availability.get("Suite"));
    }
}
