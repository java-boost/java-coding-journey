package main.java.bank.notification;

// 3. Push is 'final'
public final record Push(String content, String deviceToken) implements Notification {
    @Override
    public String getContent() { return content; }
}
