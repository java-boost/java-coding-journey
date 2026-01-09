package main.java.bank.notification;

public non-sealed class Email implements Notification {
    private final String content;
    private final String recipientEmail;

    public Email(String content, String recipientEmail) {
        this.content = content;
        this.recipientEmail = recipientEmail;
    }

    @Override
    public String getContent() { return content; }
    public String getRecipientEmail() { return recipientEmail; }
}
