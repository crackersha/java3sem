package prak27.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//1.	Преобразовать структуру данных HashSet в структуру TreeSet

/*HashSet не дает никаких гарантий относительно порядка итерации набора, или даже порядок останется постоянным с течением времени.
TreeSet, в зависимости от используемого конструктора, повторяется в соответствии с естественным порядком его элементов или в соответствии с указанным Comparator.
TreeSet является самым медленным среди всех.
HashSet требует меньше памяти, чем TreeSet, поскольку он использует хеш-таблицу для хранения своих элементов. TreeSet реализовано в виде Красно-черного дерева, занимающего значительный объем памяти.*/
class Main {
    // Общий метод для создания нового `TreeSet` из `HashSet`
    public static <T> Set<T> getInstance(Set<T> hashSet) {
        Set<T> treeSet = new TreeSet<>(hashSet);
        return treeSet;
    }

    // Программа для преобразования `HashSet` в `TreeSet`
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");

        // создаем новый `TreeSet` из `HashSet`
        Set<String> treeSet = getInstance(hashSet);
        System.out.println(treeSet);
    }
}

