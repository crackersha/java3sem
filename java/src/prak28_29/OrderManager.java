package prak28_29;

import java.util.HashMap;

public class OrderManager {
    HashMap<String, Order> orderManager = new HashMap<>();


    public void add(String address, Order order){
        orderManager.put(address,order);
    }
    public RestaurantOrder get(String address){
        return (RestaurantOrder) orderManager.get(address);
    }
    public void remove(String address){
        orderManager.remove(address);
    }
    public void add(String address,MenuItem item) throws OrderAlreadyAddedException {
        if(orderManager.containsKey(address)) throw new OrderAlreadyAddedException();
        orderManager.get(address).add(item);
    }
    public Order getOrders(String address){
        Order[] orders = new Order[orderManager.size()];
        return orderManager.get(address);
    }
    public int size(){
        return orderManager.size();
    }

    public static void main(String[] args) {
        OrderManager orderManager1 = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(new MenuItem(140,"tea","drink"));
        restaurantOrder.add(new MenuItem(320,"coffee","drink"));
        orderManager1.add("Kofeinya", restaurantOrder);
        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        restaurantOrder1.add(new MenuItem(100,"cutlet","food"));
        restaurantOrder1.add(new MenuItem(60,"pasta","food"));
        orderManager1.add("Stolovaya", restaurantOrder1);
        orderManager1.get("Kofeinya").display();
        orderManager1.get("Stolovaya").display();
    }

}
