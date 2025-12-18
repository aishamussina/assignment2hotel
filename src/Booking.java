public class Booking {

    private Guest guest;
    private Room room;
    private int nights;

    public Booking() {
    }

    public Booking(Guest guest, Room room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public double calculateTotalPrice() {
        return room.getPricePerNight() * nights;
    }

    public void printInfo() {
        System.out.println(
                "Booking → Guest: " + guest.getName() +
                        ", Room: " + room.getRoomNumber() +
                        ", Nights: " + nights +
                        ", Total price: " + calculateTotalPrice()
        );
    }
}

