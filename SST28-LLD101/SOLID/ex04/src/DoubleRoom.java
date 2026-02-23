public class DoubleRoom implements PricingComponent {

    public Money monthly() {
        return new Money(16000);
    }

    public Money deposit() {
        return new Money(5000);
    }
}