package prak30;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        InternetOrdersManager InternetOrdersManager = new InternetOrdersManager(10);
        Order order = new InternetOrder(5);
        order.add(new Dish(500,"cutlet","dish"));
        order.add(new Drink(40,"orange juice","drink",0,DrinkTypeEnum.JUICE));
        InternetOrdersManager.add(order,1);
        Order order1 = new InternetOrder(5);
        order1.add(new Dish(300,"oysters","dish"));
        order1.add(new Drink(100,"white wine","drink",18.5,DrinkTypeEnum.WINE));
        InternetOrdersManager.add(order1,2);
        MenuItem[] items = InternetOrdersManager.getOrder(1).getItems();
        System.out.println("Internet Order: ");
        System.out.println("Table: 1");
        for (int i = 0; i < items.length; i++){
            if(items[i]!=null && items[i] instanceof Dish)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription());
            else if(items[i]!=null && items[i] instanceof Drink)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription() + " " + ((Drink) items[i]).getAlcoholVol() + " " + ((Drink) items[i]).getType());
        }
        items = InternetOrdersManager.getOrder(2).getItems();
        System.out.println("Table: 2");
        for (int i = 0; i < items.length; i++){
            if(items[i]!=null && items[i] instanceof Dish)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription());
            else if(items[i]!=null && items[i] instanceof Drink)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription() + " " + ((Drink) items[i]).getAlcoholVol() + " " + ((Drink) items[i]).getType());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Table Order: ");
        Order order2 = new TableOrder(5);
        System.out.println("Table Number: ");
        int tableNumber = scanner.nextInt();
        while (true){
            int cost = 0;
            String name ="", description ="";
            double alcoholVol = 0.0;
            System.out.println("Enter cost: ");
            cost = scanner.nextInt();
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            System.out.println("Enter description: ");
            description = scanner.nextLine();
            if (description == "drink") {
                System.out.println("Enter alcoholVol: ");
                alcoholVol = scanner.nextInt();
            }
            if (description == "drink") order2.add(new Drink(cost,name,description,alcoholVol,DrinkTypeEnum.WATER));
            else order2.add(new Dish(cost,name,description));
            System.out.println("Add another dish? yes/no: ");
            String yn = scanner.nextLine();
            if (yn == "no"){
                break;
            }
        }
        TableOrdersManager.add(order2,tableNumber);
        items = TableOrdersManager.getOrder(tableNumber).getItems();
        System.out.println("Table: " + tableNumber);
        for (int i = 0; i < items.length; i++){
            if(items[i]!=null && items[i] instanceof Dish)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription());
            else if(items[i]!=null && items[i] instanceof Drink)
                System.out.println(" " + items[i].getName() + " " + items[i].getCost() + " " + items[i].getDescription() + " " + ((Drink) items[i]).getAlcoholVol() + " " + ((Drink) items[i]).getType());
        }
    }
}