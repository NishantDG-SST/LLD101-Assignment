public class ReportPrinter {

    public static void print(StudentProfile profile, EligibilityResult result) {

        System.out.println("=== Placement Eligibility ===");
        System.out.println("Student: " + profile.getName() +
                " (CGR=" + String.format("%.2f", profile.getCgr()) +
                ", attendance=" + profile.getAttendance() +
                ", credits=" + profile.getCredits() +
                ", flag=" + profile.getFlag() + ")");

        if (result.isEligible()) {
            System.out.println("RESULT: ELIGIBLE");
        } else {
            System.out.println("RESULT: NOT_ELIGIBLE");
            for (String reason : result.getReasons()) {
                System.out.println("- " + reason);
            }
        }
    }
}