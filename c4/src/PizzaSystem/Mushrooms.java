package PizzaSystem;

public class Mushrooms extends Topping {
    Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    public double cost() {
        return 4.0 + pizza.cost();
    }
}