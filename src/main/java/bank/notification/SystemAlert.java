package main.java.bank.notification;

// 4. SystemAlert is 'final'
public final record SystemAlert(String content, int alertCode) implements Notification {
    @Override
    public String getContent() { return content; }
}
