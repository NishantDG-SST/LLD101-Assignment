public class E164Validator implements PhoneValidator {

    @Override
    public void validate(String phone) {
        if (!phone.startsWith("+")) {
            throw new IllegalArgumentException(
                    "phone must start with + and country code");
        }
    }
}