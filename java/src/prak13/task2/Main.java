package prak13.task2;

/*Разработать класс Person, в котором имеется функция, возвращающая Фамилию И.О. Функция
должна учитывать возможность отсутствия значений в полях Имя и Отчество. Программу оптимизировать
 с точки зрения быстродействия.*/

public class Main {
    public static void main(String[] args) {
        Person A = new Person("Пушкин");
        System.out.println(A.toString());
        Person B = new Person("Яковлев","Лев");
        System.out.println(B.toString());
        Person C = new Person("Яковлева", "Софья", "Дмитриевна");
        System.out.println(C.toString());
    }
}