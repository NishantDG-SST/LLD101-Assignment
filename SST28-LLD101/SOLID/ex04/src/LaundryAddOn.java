public class LaundryAddOn implements PricingComponent {

    public Money monthly() {
        return new Money(1000);
    }

    public Money deposit() {
        return new Money(0);
    }
}