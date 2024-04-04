package z2;

public class SmsDelivery implements DeliveryMethod {
    @Override
    public void send() {
        System.out.println("Wysyłam sms z reklamą.");
    }
}
