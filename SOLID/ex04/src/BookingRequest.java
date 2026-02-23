import java.util.List;

public class BookingRequest {

    private final RoomType roomType;
    private final List<AddOn> addOns;

    public BookingRequest(RoomType roomType, List<AddOn> addOns) {
        this.roomType = roomType;
        this.addOns = addOns;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public List<AddOn> getAddOns() {
        return addOns;
    }
}