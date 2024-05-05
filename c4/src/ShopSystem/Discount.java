package ShopSystem;

public class Discount extends Product {
    Product product;

    public Discount(Product product) {
        description = "Discount 10 PLN";
        this.product = product;
    }

    public double cost() {
        double newCost = product.cost() - 10;
        return newCost < 0 ? 0 : newCost;
    }

    public String getDescription() {
        return product.getDescription() + ", " + description;
    }
}