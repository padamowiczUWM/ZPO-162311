package ShopSystem;

public class Bike extends Product {
    Product product;

    public Bike() {
        description = "Bike";
    }

    public Bike(Product product) {
        description = "Bike";
        this.product = product;
    }

    public double cost() {
        if(product == null) {
            return 2500;
        }
        return product.cost() + 2500;
    }

    public String getDescription() {
        if(product == null) {
            return description;
        }
        return product.getDescription() + ", " + description;
    }
}