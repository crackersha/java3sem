package prak6.task8;

// Определить класс Shop, реализующий интерфейс Printable (наверное должен быть  'Magazine')

import prak6.task6.Printable;

public class Shop implements Printable {
    public void print() {
        System.out.println("Ваш журнал напечатали!");
    }
}
