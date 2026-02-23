import java.util.ArrayList;
import java.util.List;

public class AuditLog {
    private final List<String> entries = new ArrayList<>();

    public void record(String entry) {
        entries.add(entry);
    }

    public int size() {
        return entries.size();
    }
}