package prak6;

import prak6.task10.Shop10;
import prak6.task6.Printable;
import prak6.task7.Book;
import prak6.task8.Shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task 9
        Printable[] printables = new Printable[3];
        printables[0] = new Shop();
        printables[1] = new Book();
        printables[2] = new Book();

        for (int i = 0; i < printables.length; i++){
            printables[i].print();
        }
        //task 10
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Добавление нового компьютера в список");
            System.out.println("2 - Удаление компьютера из списка");
            System.out.println("3 - Поиск компьютера в списке");
            System.out.println("0 - Выход");

            int Case = scanner.nextInt();

            if (Case == 0)
                break;

            switch (Case) {
                case 1:
                    Shop10.AddNewComputer();
                    break;
                case 2:
                    Shop10.RemoveComputer();
                    break;
                case 3:
                    Shop10.SearchComputer();
                    break;
            }
        }
    }
}