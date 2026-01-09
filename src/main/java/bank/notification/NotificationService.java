package main.java.bank.notification;

public class NotificationService {

    public void processNotification(Notification n) {
        // Switch expression returns a value and ensures all cases are covered
        int priority = switch (n) {
            case Email e -> {
                System.out.println("Sending Email to: " + e.getRecipientEmail());
                yield 3; // Low priority
            }
            case SMS s -> {
                System.out.println("Sending SMS to: " + s.phoneNumber());
                yield 2; // Medium priority
            }
            case Push p -> {
                System.out.println("Triggering Push on device: " + p.deviceToken());
                yield 2;
            }
            case SystemAlert sa -> {
                System.out.println("CRITICAL: System Alert " + sa.alertCode());
                yield 1; // High priority
            }
            // No 'default' needed! Try removing a case and the code won't compile.
            case WhatsApp whatsApp -> {
                System.out.println("WhatsApp: System Alert " + whatsApp.phoneNumber());
                yield 4; // Lowest priority
            }
        };

        System.out.println("Priority level set to: " + priority);
    }
}
