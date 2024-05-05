public class Black extends Beverage {

    @Override
    public double cost() {
        return 3.6;
    }

    public Black(String description) {
        this.description = "Black";
    }
}
