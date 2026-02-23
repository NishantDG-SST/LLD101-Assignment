import java.util.ArrayList;
import java.util.List;

public class EligibilityResult {

    private final List<String> reasons = new ArrayList<>();

    public void addReason(String reason) {
        reasons.add(reason);
    }

    public boolean isEligible() {
        return reasons.isEmpty();
    }

    public List<String> getReasons() {
        return reasons;
    }
}