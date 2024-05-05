package PizzaSystem;

public class NoCheese extends Topping {
    Pizza pizza;

    public NoCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", No Cheese";
    }

    public double cost() {
        return pizza.cost();
    }
}