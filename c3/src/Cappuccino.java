public class Cappuccino extends Beverage {

    @Override
    public double cost() {
        return 3.0;
    }

    public Cappuccino(String description) {
        this.description = "Cappuccino " + description;
    }
}
