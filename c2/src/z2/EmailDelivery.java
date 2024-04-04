package z2;

public class EmailDelivery implements DeliveryMethod {
    @Override
    public void send() {
        System.out.println("Wysyłam email z reklamą.");
    }
}
