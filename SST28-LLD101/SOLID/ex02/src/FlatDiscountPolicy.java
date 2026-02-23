public class FlatDiscountPolicy implements DiscountPolicy {

    @Override
    public double calculateDiscount(double subtotal) {
        if (subtotal > 150) {
            return 10;
        }
        return 0;
    }
}