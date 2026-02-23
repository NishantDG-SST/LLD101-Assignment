public class StudentInputParser {

    public ParsedStudent parse(String raw) {

        String[] parts = raw.split(";");

        String name = null;
        String email = null;
        String phone = null;
        String program = null;

        for (String part : parts) {
            String[] kv = part.split("=");

            String key = kv[0];
            String value = kv[1];

            switch (key) {
                case "name":
                    name = value;
                    break;
                case "email":
                    email = value;
                    break;
                case "phone":
                    phone = value;
                    break;
                case "program":
                    program = value;
                    break;
            }
        }

        return new ParsedStudent(name, email, phone, program);
    }
}