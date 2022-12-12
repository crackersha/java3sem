package prak9.task2;

/*Напишите класс SortingStudentsByGPA который реализует интерфейс Comparator таким образом,
 чтобы сортировать список студентов по их итоговым баллам в порядке убывания с использованием
 алгоритма быстрой сортировки.*/

public class Main {
    public static void main(String[] args)
    {
        SortingStudentsByGPA A = new SortingStudentsByGPA(10);
        System.out.println(A.toString());
        A.sort(0, 9);
        System.out.println(A.toString());
    }
}