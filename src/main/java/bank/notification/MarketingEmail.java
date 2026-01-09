package main.java.bank.notification;

public class MarketingEmail extends Email {
    private final String campaignId;

    public MarketingEmail(String content, String recipient, String campaignId) {
        super(content, recipient);
        this.campaignId = campaignId;
    }
}
