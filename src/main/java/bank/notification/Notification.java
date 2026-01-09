package main.java.bank.notification;

public sealed interface Notification permits Email, SMS, Push,SystemAlert,WhatsApp {
    String getContent();
}
