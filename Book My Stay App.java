
abstract class Room {
    private int beds;
    private double price;
    private String type;

    // Constructor
    public Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Room Type : " + type);
        System.out.println("Beds      : " + beds);
        System.out.println("Price     : ₹" + price);
    }
}
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 2000);
    }
}
class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 3500);
    }
}
class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 6000);
    }
}
public class UseCase2RoomInitialization {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Welcome to Book My Stay App");
        System.out.println("   Hotel Booking System v2.1");
        System.out.println("=====================================\n");
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;
        System.out.println("---- Room Details & Availability ----\n");
        single.displayDetails();
        System.out.println("Available : " + singleAvailable + "\n");
        doubleRoom.displayDetails();
        System.out.println("Available : " + doubleAvailable + "\n");
        suite.displayDetails();
        System.out.println("Available : " + suiteAvailable + "\n");
        System.out.println("Application terminated successfully.");
    }
}
