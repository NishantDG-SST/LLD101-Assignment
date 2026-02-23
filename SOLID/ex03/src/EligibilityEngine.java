import java.util.List;

public class EligibilityEngine {

    private final List<EligibilityRule> rules;
    private final FakeEligibilityStore store;

    public EligibilityEngine(List<EligibilityRule> rules,
                             FakeEligibilityStore store) {
        this.rules = rules;
        this.store = store;
    }

    public EligibilityResult evaluate(StudentProfile profile) {

        EligibilityResult result = new EligibilityResult();

        for (EligibilityRule rule : rules) {
            String reason = rule.validate(profile);
            if (reason != null) {
                result.addReason(reason);
            }
        }
        return result;
    }
}