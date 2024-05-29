
public class Quest implements Observer {
    String itemName;
    int requiredQuantity;
    Subject inventory;

    public Quest(String itemName, int requiredQuantity, Subject inventory) {
        this.itemName = itemName;
        this.requiredQuantity = requiredQuantity;
        this.inventory = inventory;
        inventory.registerObserver(this);
    }

    @Override
    public void update(String item, int quantity) {
        if (item.equals(itemName)) {
            System.out.println(itemName + ": " + quantity + "/" + requiredQuantity);
            if (quantity >= requiredQuantity) {
                System.out.println("Zadanie wykonane! Zebrano wymagana ilosc " + itemName);
                inventory.removeObserver(this);
            }
        }
    }
}
