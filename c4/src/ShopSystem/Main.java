package ShopSystem;

public class Main {
    public static void main(String[] args) {
        Product basket = new Bike();
        basket = new Bike(basket);
        basket = new PendriveLanyard(basket);
        System.out.println(basket.getDescription() + " - " + basket.cost());
        basket = new PendriveLanyard(basket);
        System.out.println(basket.getDescription() + " - " + basket.cost());
        basket = new Shipment(basket);
        System.out.println(basket.getDescription() + " - " + basket.cost());
        basket = new Discount(basket);
        System.out.println(basket.getDescription() + " - " + basket.cost());
    }
}