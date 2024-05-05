package PizzaSystem;

public class NoTomato extends Topping {
    Pizza pizza;

    public NoTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", No Tomato";
    }

    public double cost() {
        return pizza.cost();
    }
}