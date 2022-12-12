package prak9.task1;

/*Написать тестовый класс, который создает массив класса Student и
сортирует массив iDNumber и сортирует его вставками.*/

/*Сортировка вставками — алгоритм сортировки, в котором элементы входной последовательности просматриваются по одному,
и каждый новый поступивший элемент размещается в подходящее место среди ранее упорядоченных элементов.*/

public class Main {
    public static void main(String[] args)
    {
        Test A = new Test(5);
        System.out.println(A.toString());
        A.sort();
        System.out.println(A.toString());
    }
}