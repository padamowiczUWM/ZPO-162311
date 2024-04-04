package z1;

public class Postac {
    Atak atak;

    public Postac(Atak atak) {
        this.atak = atak;
    }

    public void atakuj() {
        this.atak.rozpocznij();
    }
}
