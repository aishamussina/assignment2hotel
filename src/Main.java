public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(101, "Single", 15000, true);
        Room room2 = new Room(102, "Double", 25000, false);


        Guest guest1 = new Guest("Aisha", 18, "+77001234567");
        Guest guest2 = new Guest("Ali", 21, "+77007654321");


        Booking booking1 = new Booking(guest1, room1, 3);
        Booking booking2 = new Booking(guest2, room2, 2);


        System.out.println("=== ROOMS ===");
        room1.printInfo();
        room2.printInfo();

        System.out.println("\n=== GUESTS ===");
        guest1.printInfo();
        guest2.printInfo();

        System.out.println("\n=== BOOKINGS ===");
        booking1.printInfo();
        booking2.printInfo();


        System.out.println("\n=== BOOKING PRICE COMPARISON ===");

        if (booking1.calculateTotalPrice() > booking2.calculateTotalPrice()) {
            System.out.println("Booking 1 is more expensive.");
        } else if (booking1.calculateTotalPrice() < booking2.calculateTotalPrice()) {
            System.out.println("Booking 2 is more expensive.");
        } else {
            System.out.println("Both bookings cost the same.");
        }


        System.out.println("\n=== LOOP THROUGH ROOMS ===");

        Room[] rooms = { room1, room2 };
        int availableCount = 0;

        for (int i = 0; i < rooms.length; i++) {
            rooms[i].printInfo();

            if (rooms[i].isAvailable()) {
                availableCount++;
            }
        }

        System.out.println("Available rooms: " + availableCount);
    }
}
