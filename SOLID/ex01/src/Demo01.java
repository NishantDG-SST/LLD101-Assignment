import java.util.Arrays;

public class Demo01 {

    public static void main(String[] args) {

        StudentInputParser parser = new StudentInputParser();

        StudentValidator validator = new StudentValidator(Arrays.asList("CSE", "ECE", "MECH"));

        StudentRepository repository = new FakeDb();

        OnboardingPrinter printer = new OnboardingPrinter();

        OnboardingService service = new OnboardingService(parser, validator, repository, printer);

        String input = "name=Riya;email=riya@sst.edu;phone=9876543210;program=CSE";

        service.registerFromRawInput(input);
    }
}