public class Latte extends Beverage {

    @Override
    public double cost() {
        return 2.0;
    }

    public Latte(String description) {
        this.description = "Latte";
    }
}
