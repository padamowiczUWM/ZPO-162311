package ShopSystem;

public class Shipment extends Product {
    Product product;

    public Shipment(Product product) {
        description = "Shipment cost 13 PLN";
        this.product = product;
    }

    public double cost() {
        return product.cost() + 13;
    }

    public String getDescription() {
        return product.getDescription() + ", " + description;
    }
}