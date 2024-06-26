import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - Quantity: " + quantity + ", Price: $" + price;
    }
}

public class CollectionsEx {
    private ArrayList<Item> items = new ArrayList<>();
    private HashSet<String> itemNames = new HashSet<>();
    private HashMap<String, Item> itemMap = new HashMap<>();
    private LinkedList<String> recentOperations = new LinkedList<>();

    public void addItem(String name, int quantity, double price) {
        if (itemNames.contains(name)) {
            System.out.println("Item already exists. Use updateItem to change quantity or price.");
        } else {
            Item item = new Item(name, quantity, price);
            items.add(item);
            itemNames.add(name);
            itemMap.put(name, item);
            recentOperations.add("Added item: " + name);
            System.out.println("Item added successfully.");
        }
    }

    public void updateItem(String name, int quantity, double price) {
        if (itemMap.containsKey(name)) {
            Item item = itemMap.get(name);
            item.setQuantity(quantity);
            item.setPrice(price);
            recentOperations.add("Updated item: " + name);
            System.out.println("Item updated successfully.");
        } else {
            System.out.println("Item not found. Use addItem to add new item.");
        }
    }

    public void removeItem(String name) {
        if (itemMap.containsKey(name)) {
            items.remove(itemMap.get(name));
            itemNames.remove(name);
            itemMap.remove(name);
            recentOperations.add("Removed item: " + name);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void displayRecentOperations() {
        System.out.println("Recent Operations:");
        for (String operation : recentOperations) {
            System.out.println(operation);
        }
    }

    public static void main(String[] args) {
        CollectionsEx inventory = new CollectionsEx();

        inventory.addItem("Apple", 100, 0.50);
        inventory.addItem("Banana", 150, 0.30);
        inventory.updateItem("Apple", 120, 0.55);
        inventory.removeItem("Banana");
        inventory.displayInventory();
        inventory.displayRecentOperations();
    }
}
