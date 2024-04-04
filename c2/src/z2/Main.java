package z2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ad> advertisements = new ArrayList<>();
        advertisements.add(new Ad(new CarAdvertisement(), new PlTranslator(), new EmailDelivery()));
        advertisements.add(new Ad(new VacuumAdvertisement(), new GerTranslator(), new SmsDelivery()));
        advertisements.add(new Ad(new CarAdvertisement(), new PlTranslator(), new VoiceDelivery()));
        advertisements.add(new Ad(new CarAdvertisement(), new GerTranslator(), new EmailDelivery()));


        for(Ad advertisement: advertisements) {
            advertisement.send();
        }
    }
}
