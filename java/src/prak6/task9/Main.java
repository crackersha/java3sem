package prak6.task9;

/*Создать массив типа Printable, который будет содержать книги и
журналы. В цикле пройти по массиву объектов и вызвать метод print() для
каждого объекта.*/

import prak6.task6.Printable;
import prak6.task7.Book;
import prak6.task8.Shop;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = new Shop();
        printables[1] = new Book();
        printables[2] = new Book();

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
    }
}