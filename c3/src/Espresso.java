public class Espresso extends Beverage {

    @Override
    public double cost() {
        return 4.0;
    }

    public Espresso(String description) {
        this.description = "Espresso";
    }
}
