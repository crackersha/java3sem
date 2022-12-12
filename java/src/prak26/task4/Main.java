package prak26.task4;

/*На Set Протестировать созданные функции – создать очередь с приоритетом из 10 элементов.
 Извлечь и вывести на экран значения нескольких элементов. */

public class Main {
    public static void main(String[] args) {
        Hash hash = new Hash(6);
        hash.Add(6);
        hash.Add(0);
        hash.Add(2);
        hash.Add(10);
        System.out.println(hash.getElement(4));
        System.out.println(hash.getElement(6));
        hash.Delete(6);
        System.out.println(hash.getElement(6));
        hash.Add(5);
        hash.Add(4);
        hash.Add(9);
        hash.Add(8);
        hash.Add(3);
        hash.Add(17);
        hash.Add(11);
        hash.Vivod();

    }
}
