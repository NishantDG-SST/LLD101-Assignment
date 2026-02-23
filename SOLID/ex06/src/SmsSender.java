public class SmsSender implements NotificationSender {

    private final AuditLog audit;

    public SmsSender(AuditLog audit) {
        this.audit = audit;
    }

    @Override
    public void send(Notification notification) {
        System.out.println("SMS -> to=" + notification.getTo()
                + " body=" + notification.getBody());

        audit.record("SMS");
    }
}