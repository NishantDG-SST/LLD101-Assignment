public class Demo06 {

    public static void main(String[] args) {

        System.out.println("=== Notification Demo ===");

        AuditLog audit = new AuditLog();

        Notification emailNotification =
                new Notification("riya@sst.edu",
                        "Welcome",
                        "Hello and welcome to SST!");

        Notification smsNotification =
                new Notification("9876543210",
                        "Welcome",
                        "Hello and welcome to SST!");

        Notification waNotification =
                new Notification("9876543210",
                        "Welcome",
                        "Hello and welcome to SST!");

        NotificationSender emailSender = new EmailSender(audit);
        NotificationSender smsSender = new SmsSender(audit);
        NotificationSender waSender = new WhatsAppSender(audit, new E164Validator());

        emailSender.send(emailNotification);
        smsSender.send(smsNotification);

        try {
            waSender.send(waNotification);
        } catch (IllegalArgumentException e) {
            System.out.println("WA ERROR: " + e.getMessage());
            audit.record("WA ERROR");
        }

        System.out.println("AUDIT entries=" + audit.size());
    }
}