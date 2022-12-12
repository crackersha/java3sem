package prak20.task1_2_3;

/*
1. Создать обобщенный класс с тремя параметрами (T, V, K).

2. Класс содержит три переменные типа (T, V, K), конструктор,
принимающий на вход параметры типа (T, V, K), методы возвращающие
значения трех переменных. Создать метод, выводящий на консоль имена
классов для трех переменных класса.

3. Наложить ограничения на параметры типа: T должен
реализовать интерфейс Comparable (классы оболочки, String), V должен
реализовать интерфейс Serializable и расширять класс Animal, K */

public class Main<T extends String, V extends Animal, K extends Number> {
    private T type;
    private V value;
    private K key;

    public Main(T type, V value, K key) {
        this.type = type;
        this.value = value;
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "type=" + type +
                ", value=" + value +
                ", key=" + key +
                '}';
    }

    public static void main(String[] args) {
        Main<String,Animal,Integer> task = new Main<>("Dog",new Dog(),15);
        System.out.println(task);
    }
}