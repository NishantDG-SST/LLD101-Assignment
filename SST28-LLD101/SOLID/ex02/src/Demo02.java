import java.util.*;

public class Demo02 {

    public static void main(String[] args) {

        MenuRepository menu = new MenuRepository();

        List<OrderLine> order = new ArrayList<>();
        order.add(new OrderLine(menu.findByCode("V1"), 2));
        order.add(new OrderLine(menu.findByCode("C1"), 1));

        CafeteriaSystem system = new CafeteriaSystem(
                new PricingService(),
                new PercentageTaxPolicy(0.05),
                new FlatDiscountPolicy(),
                new InvoiceFormatter(),
                new InMemoryInvoiceStore()
        );

        system.checkout("INV-1001", order);
    }
}