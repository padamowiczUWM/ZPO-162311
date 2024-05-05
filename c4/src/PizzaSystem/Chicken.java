package PizzaSystem;

public class Chicken extends Topping {
    Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    public double cost() {
        return 5.0 + pizza.cost();
    }
}