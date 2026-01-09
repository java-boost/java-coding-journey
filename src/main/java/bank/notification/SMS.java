package main.java.bank.notification;

// 2. SMS is 'final' (No one can extend this)
public final record SMS(String content, String phoneNumber) implements Notification {
    @Override
    public String getContent() { return content; }
}