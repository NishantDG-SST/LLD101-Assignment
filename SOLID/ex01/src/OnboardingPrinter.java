import java.util.List;

public class OnboardingPrinter {

    public void printHeader(String input) {
        System.out.println("=== Student Onboarding ===");
        System.out.println("INPUT: " + input);
    }

    public void printSuccess(String id, int total) {
        System.out.println("OK: created student " + id);
        System.out.println("Saved. Total students: " + total);
    }

    public void printConfirmation(StudentRecord record) {
        System.out.println("CONFIRMATION:");
        System.out.println(record);
        System.out.println();
    }

    public void printDbDump(List<StudentRecord> students) {

        System.out.println("-- DB DUMP --");
        System.out.println("| ID             | NAME | PROGRAM |");

        for (StudentRecord s : students) {
            System.out.printf(
                    "| %-15s | %-4s | %-7s |%n",
                    s.getId(),
                    s.getName(),
                    s.getProgram()
            );
        }
    }

    public void printErrors(List<String> errors) {
        for (String e : errors) {
            System.out.println("ERROR: " + e);
        }
    }
}