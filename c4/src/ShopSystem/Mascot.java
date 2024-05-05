package ShopSystem;

public class Mascot extends Product {
    Product product;

    public Mascot() {
        description = "Mascot";
    }

    public Mascot(Product product) {
        description = "Mascot";
        this.product = product;
    }

    public double cost() {
        if(product == null) {
            return 0;
        }
        return product.cost() + 0;
    }

    public String getDescription() {
        if(product == null) {
            return description;
        }
        return product.getDescription() + ", " + description;
    }
}