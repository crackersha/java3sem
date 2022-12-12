package prak26.task3;

//Продемонстрировать поиск элемента по ключу и удаление элемента.Продемонстрировать поиск элемента по ключу и удаление элемента.

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
    }
}
