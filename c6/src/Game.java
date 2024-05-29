public class Game {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Quest quest = new Quest("Mushroom", 10, inventory);
        inventory.addItem("Mushroom", 3);
        inventory.addItem("Mushroom", 3);
        inventory.removeItem("Mushroom", 3);
        inventory.addItem("Mushroom", 3);
        inventory.addItem("Mushroom", 3);
        inventory.addItem("Mushroom", 3);
    }
}
