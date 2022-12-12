package prak32;


public interface OrderManager
{
    int itemsQuantity(String name);
    int itemsQuantity(MenuItem item);
    Order[] getOrder();
    int ordersCostSummary();
    int ordersQuantity();
}