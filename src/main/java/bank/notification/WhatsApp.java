package main.java.bank.notification;

public final record WhatsApp(String content, String phoneNumber) implements Notification {
    @Override
    public String getContent() { return content; }
}
