import java.util.List;

public class PricingService {

    public double calculateSubtotal(List<OrderLine> lines) {
        double total = 0;
        for (OrderLine line : lines) {
            total += line.lineTotal();
        }
        return total;
    }
}