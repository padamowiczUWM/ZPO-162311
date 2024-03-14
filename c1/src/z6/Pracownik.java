package z6;

public class Pracownik implements Dojezdzac, Pracowac, SpedzanieWolnegoCzasu {

    String zawod;
    Pracowac pracowac;
    Dojezdzac dojezdzac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;

    public Pracownik(String zawod, Dojezdzac dojezdzac, Pracowac pracowac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu) {
        this.zawod = zawod;
        this.dojezdzac = dojezdzac;
        this.pracowac = pracowac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
    }
    @Override
    public void dojezdzaj() {
        dojezdzac.dojezdzaj();
    }

    @Override
    public void pracuj() {
        pracowac.pracuj();
    }

    @Override
    public void spedzajWolnyCzas() {
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }
}
