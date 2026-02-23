import java.util.Arrays;
import java.util.List;

public class Demo03 {

    public static void main(String[] args) {

        StudentProfile profile = new StudentProfile(
                "23BCS1001",
                "Ayaan",
                8.10,
                72,
                18,
                "NONE"
        );

        List<EligibilityRule> rules = Arrays.asList(
                new CgrRule(7.0),
                new AttendanceRule(75),
                new CreditsRule(20),
                new DisciplinaryRule()
        );
        FakeEligibilityStore store = new FakeEligibilityStore();
        EligibilityEngine engine = new EligibilityEngine(rules, store);

        EligibilityResult result = engine.evaluate(profile);

        ReportPrinter.print(profile, result);
        store.save(profile.getRollNumber());
    }
}