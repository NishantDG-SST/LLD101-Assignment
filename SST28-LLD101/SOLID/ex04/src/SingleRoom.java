public class SingleRoom implements PricingComponent {

    public Money monthly() {
        return new Money(10000);
    }

    public Money deposit() {
        return new Money(3000);
    }
}