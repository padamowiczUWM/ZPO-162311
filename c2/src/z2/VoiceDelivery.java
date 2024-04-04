package z2;

public class VoiceDelivery implements DeliveryMethod {
    @Override
    public void send() {
        System.out.println("Wysyłam wiadomość głosową z reklamą.");
    }
}
