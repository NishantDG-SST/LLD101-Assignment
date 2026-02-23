public class MessAddOn implements PricingComponent {

    public Money monthly() {
        return new Money(2000);
    }

    public Money deposit() {
        return new Money(0);
    }
}