package PizzaSystem;

public class Cheese extends Topping {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double cost() {
        return 3.0 + pizza.cost();
    }
}