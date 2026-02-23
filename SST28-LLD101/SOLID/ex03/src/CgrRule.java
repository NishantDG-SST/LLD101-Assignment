public class CgrRule implements EligibilityRule {

    private final double minCgr;

    public CgrRule(double minCgr) {
        this.minCgr = minCgr;
    }

    @Override
    public String validate(StudentProfile profile) {
        if (profile.getCgr() < minCgr) {
            return "cgr below " + minCgr;
        }
        return null;
    }
}