package prak28_29;

public class RestaurantOrder implements Order {

    InternetOrder internetOrder = new InternetOrder();
    public boolean add(MenuItem item) {
        return internetOrder.add(item);
    }

    public boolean remove(String itemName) {
        return internetOrder.remove(itemName);
    }

    public int removeAll(String itemName) {
        return internetOrder.removeAll(itemName);
    }

    public int removeAll(MenuItem item) {
        return internetOrder.removeAll(item);
    }

    public MenuItem[] sortedItemsByCostDesc() {
        return internetOrder.sortedItemsByCostDesc();
    }

    public int costTotal() {
        return internetOrder.costTotal();
    }

    public int size() {
        return internetOrder.size();
    }

    public String[] nameOfItems() {
        return internetOrder.nameOfItems();
    }

    public void display() {
        internetOrder.display();
    }
}
