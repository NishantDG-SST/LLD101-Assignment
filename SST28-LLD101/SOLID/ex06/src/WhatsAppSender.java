public class WhatsAppSender implements NotificationSender {

    private final AuditLog audit;
    private final PhoneValidator validator;

    public WhatsAppSender(AuditLog audit, PhoneValidator validator) {
        this.audit = audit;
        this.validator = validator;
    }

    @Override
    public void send(Notification notification) {
        validator.validate(notification.getTo());

        System.out.println("WA -> to=" + notification.getTo()
                + " body=" + notification.getBody());

        audit.record("WA");
    }
}