import java.util.List;

public class CafeteriaSystem {

    private final PricingService pricingService;
    private final TaxPolicy taxPolicy;
    private final DiscountPolicy discountPolicy;
    private final InvoiceFormatter formatter;
    private final InvoiceStore store;

    public CafeteriaSystem(
            PricingService pricingService,
            TaxPolicy taxPolicy,
            DiscountPolicy discountPolicy,
            InvoiceFormatter formatter,
            InvoiceStore store
    ) {
        this.pricingService = pricingService;
        this.taxPolicy = taxPolicy;
        this.discountPolicy = discountPolicy;
        this.formatter = formatter;
        this.store = store;
    }

    public void checkout(String invoiceId, List<OrderLine> lines) {

        double subtotal = pricingService.calculateSubtotal(lines);
        double tax = taxPolicy.calculateTax(subtotal);
        double discount = discountPolicy.calculateDiscount(subtotal);
        double total = subtotal + tax - discount;

        String invoiceText = formatter.format(
                invoiceId,
                lines,
                subtotal,
                tax,
                discount,
                total,
                taxPolicy.label()
        );

        System.out.print(invoiceText);
        store.save(invoiceId, invoiceText);
    }
}