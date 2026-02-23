public class PercentageTaxPolicy implements TaxPolicy {

    private final double rate;

    public PercentageTaxPolicy(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateTax(double subtotal) {
        return subtotal * rate;
    }

    @Override
    public String label() {
        return "Tax(5%)";
    }
}