package prak32;

public interface Order
{
    boolean add(MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem itemName);
    MenuItem get(int index);
    MenuItem[] getItems();
    boolean remove(String item);
    boolean remove(MenuItem item);
    int removeFew(String itemName);
    int removeFew(MenuItem item);
    MenuItem[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
    String toString();
    int hashCode();
    boolean equals(Object object);

}