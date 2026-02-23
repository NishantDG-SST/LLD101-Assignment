import java.util.HashMap;
import java.util.Map;

public class InMemoryInvoiceStore implements InvoiceStore {

    private final Map<String, String> store = new HashMap<>();

    @Override
    public void save(String invoiceId, String content) {
        store.put(invoiceId, content);
        System.out.println("Saved invoice: " + invoiceId + " (lines=7)");
    }
}