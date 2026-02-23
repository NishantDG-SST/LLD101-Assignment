import java.util.List;
public class Demo04 {

    public static void main(String[] args) {

        BookingRequest request = new BookingRequest(
                RoomType.DOUBLE,
                List.of(AddOn.LAUNDRY, AddOn.MESS)
        );

        BookingService service = new BookingService(
                new HostelFeeCalculator(),
                new ReceiptPrinter(),
                new FakeBookingRepo()
        );

        service.process(request);
    }
}