package z1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Postac> postacie = new ArrayList<>();
        postacie.add(new Postac(new Rycerz()));
        postacie.add(new Postac(new Lucznik()));
        postacie.add(new Postac(new Kanonier()));
        postacie.add(new Postac(new Strzelec()));

        for(Postac postac: postacie) {
            postac.atakuj();
        }
    }
}
