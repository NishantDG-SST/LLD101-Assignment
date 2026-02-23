import java.util.UUID;

public class FakeBookingRepo {

    public void save(BookingRequest request) {
        String bookingId = "H-" + UUID.randomUUID().toString().substring(0, 4);
        System.out.println("Saved booking: " + bookingId);
    }
}