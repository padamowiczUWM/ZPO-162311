package z2;

public class Ad {
    Translator translator;
    DeliveryMethod deliveryMethod;
    Advertisement advertisement;

    public Ad(Advertisement advertisement, Translator translator, DeliveryMethod deliveryMethod) {
        this.advertisement = advertisement;
        this.translator = translator;
        this.deliveryMethod = deliveryMethod;
    }

    public void send() {
        this.advertisement.choose();
        this.translator.translate();
        this.deliveryMethod.send();
    }
}
