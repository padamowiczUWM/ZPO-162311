package ShopSystem;

public class PendriveLanyard extends Product {
    Product product;

    public PendriveLanyard() {
        description = "PendriveLanyard";
    }

    public PendriveLanyard(Product product) {
        description = "PendriveLanyard";
        this.product = product;
    }

    public double cost() {
        if(product == null) {
            return 1;
        }
        return product.cost() + 1;
    }

    public String getDescription() {
        if(product == null) {
            return description;
        }
        return product.getDescription() + ", " + description;
    }
}