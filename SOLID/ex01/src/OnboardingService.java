import java.util.List;

public class OnboardingService {

    private final StudentInputParser parser;
    private final StudentValidator validator;
    private final StudentRepository repository;
    private final OnboardingPrinter printer;

    public OnboardingService(StudentInputParser parser,StudentValidator validator,StudentRepository repository,OnboardingPrinter printer) {
        this.parser = parser;
        this.validator = validator;
        this.repository = repository;
        this.printer = printer;
    }

    public void registerFromRawInput(String rawInput) {

        printer.printHeader(rawInput);

        ParsedStudent data = parser.parse(rawInput);

        List<String> errors = validator.validate(data);

        if (!errors.isEmpty()) {
            printer.printErrors(errors);
            return;
        }

        String id = IdUtil.generateId(repository.count() + 1);

        StudentRecord record = new StudentRecord(
                id,
                data.name,
                data.email,
                data.phone,
                data.program
        );

        repository.save(record);

        printer.printSuccess(id, repository.count());
        printer.printConfirmation(record);
        printer.printDbDump(repository.findAll());
    }
}