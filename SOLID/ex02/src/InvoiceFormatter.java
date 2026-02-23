import java.util.List;

public class InvoiceFormatter {

    public String format(
            String invoiceId,
            List<OrderLine> lines,
            double subtotal,
            double tax,
            double discount,
            double total,
            String taxLabel
    ) {
        if (lines == null || lines.isEmpty()) {
            return "No items ordered.";
        }
        StringBuilder sb = new StringBuilder();

        sb.append("=== Cafeteria Billing ===\n");
        sb.append("Invoice# ").append(invoiceId).append("\n");

        for (OrderLine line : lines) {
            sb.append("- ")
              .append(line.item.name)
              .append(" x")
              .append(line.quantity)
              .append(" = ")
              .append(String.format("%.2f", line.lineTotal()))
              .append("\n");
        }

        sb.append("Subtotal: ").append(String.format("%.2f", subtotal)).append("\n");
        sb.append(taxLabel).append(": ").append(String.format("%.2f", tax)).append("\n");
        sb.append("Discount: -").append(String.format("%.2f", discount)).append("\n");
        sb.append("TOTAL: ").append(String.format("%.2f", total)).append("\n");

        return sb.toString();
    }
}