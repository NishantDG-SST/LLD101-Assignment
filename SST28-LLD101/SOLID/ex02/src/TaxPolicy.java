public interface TaxPolicy {
    double calculateTax(double subtotal);
    String label();
}