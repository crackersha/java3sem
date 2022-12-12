package prak9.task3;

/*Напишите программу, которая объединяет два списка данных о студентах
в один отсортированный спискок с использованием алгоритма сортировки слиянием.*/

public class Main {
    public static void main(String[] args)
    {
        Test A = new Test(5, 7);
        System.out.println("First list of students:");
        System.out.println(A.toStringOneOld());
        System.out.println("Second list of students:");
        System.out.println(A.toStringTwoOld());
        A.NewMass();
        System.out.println("Final list:");
        System.out.println(A.toStringOneNew());
    }
}