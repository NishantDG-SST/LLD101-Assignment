public class DeluxeRoom implements PricingComponent {

    public Money monthly() {
        return new Money(22000);
    }

    public Money deposit() {
        return new Money(7000);
    }
}