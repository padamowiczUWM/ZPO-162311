package PizzaSystem;

public class Main {
    public static void main(String[] args) {
        Pizza newYork = new NewYork();
        System.out.println(newYork.getDescription() + " - " + newYork.cost());

        newYork = new NoCheese(newYork);
        System.out.println(newYork.getDescription() + " - " + newYork.cost());

        newYork = new Mushrooms(newYork);
        System.out.println(newYork.getDescription() + " - " + newYork.cost());
    }
}