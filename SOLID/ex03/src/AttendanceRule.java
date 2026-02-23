public class AttendanceRule implements EligibilityRule {

    private final int minAttendance;

    public AttendanceRule(int minAttendance) {
        this.minAttendance = minAttendance;
    }

    @Override
    public String validate(StudentProfile profile) {
        if (profile.getAttendance() < minAttendance) {
            return "attendance below " + minAttendance;
        }
        return null;
    }
}