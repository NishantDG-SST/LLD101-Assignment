public class EmailSender implements NotificationSender {

    private final AuditLog audit;

    public EmailSender(AuditLog audit) {
        this.audit = audit;
    }

    @Override
    public void send(Notification notification) {
        System.out.println("EMAIL -> to=" + notification.getTo()
                + " subject=" + notification.getSubject()
                + " body=" + notification.getBody());

        audit.record("EMAIL");
    }
}