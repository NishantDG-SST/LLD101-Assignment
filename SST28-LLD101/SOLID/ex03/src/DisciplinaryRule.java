public class DisciplinaryRule implements EligibilityRule {

    @Override
    public String validate(StudentProfile profile) {
        if (!"NONE".equals(profile.getFlag())) {
            return "disciplinary flag present";
        }
        return null;
    }
}