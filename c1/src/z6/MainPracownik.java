package z6;

import java.util.ArrayList;

public class MainPracownik {
    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(new Pracownik("Doktor", new Samochod(), new Leczenie(), new LiteraturaPopularnoNaukowa()));
        pracownicy.add(new Pracownik("Listonosz", new Rower(), new RoznoszenieListow(), new Silownia()));
        pracownicy.add(new Pracownik("Mechanik", new Samochod(), new NaprawaSamochodow(), new Silownia()));

        for(Pracownik pracownik: pracownicy) {
            System.out.println(pracownik.zawod);
            pracownik.dojezdzaj();
            pracownik.pracuj();
            pracownik.spedzajWolnyCzas();
        }
    }
}
