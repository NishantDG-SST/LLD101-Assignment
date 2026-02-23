import java.util.List;

public class BookingService {

    private final HostelFeeCalculator calculator;
    private final ReceiptPrinter printer;
    private final FakeBookingRepo repo;

    public BookingService(HostelFeeCalculator calculator,ReceiptPrinter printer,FakeBookingRepo repo) {
        this.calculator = calculator;
        this.printer = printer;
        this.repo = repo;
    }

    public void process(BookingRequest request) {
        List<PricingComponent> components = PricingFactory.createComponents(request);
        FeeBreakdown breakdown = calculator.calculate(components);
        printer.print(request, breakdown);
        repo.save(request);
    }
}