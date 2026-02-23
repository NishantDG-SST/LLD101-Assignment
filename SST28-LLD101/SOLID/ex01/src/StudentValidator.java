import java.util.ArrayList;
import java.util.List;

public class StudentValidator {

    private final List<String> allowedPrograms;

    public StudentValidator(List<String> allowedPrograms) {
        this.allowedPrograms = allowedPrograms;
    }

    public List<String> validate(ParsedStudent s) {

        List<String> errors = new ArrayList<>();

        if (s.name == null || s.name.isEmpty()) {
            errors.add("Name required");
        }

        if (s.email == null || !s.email.contains("@")) {
            errors.add("Invalid email");
        }

        if (s.phone == null || !s.phone.matches("\\d+")) {
            errors.add("Invalid phone");
        }

        if (s.program == null || !allowedPrograms.contains(s.program)) {
            errors.add("Invalid program");
        }

        return errors;
    }
}