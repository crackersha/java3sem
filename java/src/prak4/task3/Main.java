package prak4.task3;

import java.util.Scanner;
/*
Создать мини приложение - интернет-магазин. Должны быть
реализованы следующие возможности:
1) Аутентификация пользователя. Пользователь вводит логин и пароль с
клавиатуры.
2) Просмотр списка каталогов товаров.
3) Просмотр списка товаров определенного каталога.
4) Выбор товара в корзину.
5) Покупка товаров, находящихся в корзине.*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин и пароль: ");

        String login = scanner.next();
        int password = scanner.nextInt();

        if (Users.valueOf(login) == Users.Vanya && password == Users.Vanya.getPassword()) {
            System.out.println("Вы вошли как 'Vanya'");
        } else if (Users.valueOf(login) == Users.Sonya && password == Users.Sonya.getPassword()) {
            System.out.println("Вы вошли как 'Sonya'");
        } else if (Users.valueOf(login) == Users.Crackersha && password == Users.Crackersha.getPassword()) {
            System.out.println("Вы вошли как 'Crackersha'");
        }

        String basket = "";
        while (true){

            System.out.println("Выберите каталог: ");
            for (Catalog catalog : Catalog.values()) {
                System.out.println(catalog);
            }
            String catalog = scanner.next();


            switch (Catalog.valueOf(catalog)) {
                case TOYS:
                    System.out.println("Выберите игрушку: ");
                    for (TOYS toys : TOYS.values()) {
                        System.out.println(toys);
                    }
                    String toys = scanner.next();

                    basket += toys + " ";

                    break;
                case STATIONERY:
                    System.out.println("Выберите канцелярский товар: ");
                    for (STATIONERY stationery : STATIONERY.values()) {
                        System.out.println(stationery);
                    }
                    String stationery = scanner.next();

                    basket += stationery + " ";
                    break;
            }

            System.out.println("Товар добавлен в корзину.\nВ корзине сейчас: " + basket);
            System.out.println("Хотите оплатить[0] или продолжить покупки[1] ?");
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Успешно оплачено!");
                break;
            }
        }

    }
}
