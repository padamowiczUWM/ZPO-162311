package ShopSystem;

public abstract class Product {
    String description = "Unknown Product";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}