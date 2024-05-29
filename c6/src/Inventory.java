import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Inventory implements Subject {
    Map<String, Integer> items;
    CopyOnWriteArrayList<Observer> observers;

    public Inventory() {
        observers = new CopyOnWriteArrayList<>();
        items = new HashMap<>();
    }

    public void addItem(String item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
        notifyObservers(item);
    }

    public void removeItem(String item, int quantity) {
        if (items.containsKey(item)) {
            int newQuantity = items.get(item) - quantity;
            if (newQuantity <= 0) {
                items.remove(item);
            } else {
                items.put(item, newQuantity);
            }
            notifyObservers(item);
        }
    }

    public int getItemQuantity(String item) {
        return items.getOrDefault(item, 0);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String item) {
        int quantity = items.getOrDefault(item, 0);
        for (Observer o : observers) {
            o.update(item, quantity);
        }
    }
}
