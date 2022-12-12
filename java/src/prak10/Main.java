package prak10;
import prak10.task2and3.SortingStudentsByGPA;

/*
Напишите класс SortingStudentsByGPA (может у вас называться Tester или Main, так как содержит
функцию main()) создайте поле как массив объектов Student с названием iDNumber, вы можете использовать
как массив, так и и ArrayList или TreeSet для хранения данных о студентах
Добавьте методы класса: 1) заполнения массива setArray() 2) метод для сортировки по среднему баллу студентов
quicksort() который реализует интерфейс Comparator таким образом, чтобы он сортировал студентов с их итоговым
баллом в порядке убывания. В качестве алгоритма сортировки использовать методы сортировок: слиянием и быструю
сортировку (добавьте в класс еще один метод). 3)метод для вывода массива студентов outArray() 4)Добавьте в класс
возможность сортировать список студентов по другому полю

Напишите программу, которая объединяет два списка данных о студентах в один отсортированный списках.*/


public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA A = new SortingStudentsByGPA();
        System.out.println("\nComplete list A:\n");
        A.setArray(3);
        System.out.println("\nList A:\n");
        A.outArray();
        System.out.println("\nSort list A by GPA:\n");
        A.quicksortGPA();
        A.outArray();
        System.out.println("\nSort list A by Course:\n");
        A.quicksortCourse();
        A.outArray();
        System.out.println("\nSort list A by Group:\n");
        A.quicksortGroup();
        A.outArray();
        SortingStudentsByGPA B = new SortingStudentsByGPA();
        System.out.println("\nComplete list B:\n");
        B.setArray(2);
        System.out.println("\nList B:\n");
        B.outArray();
        SortingStudentsByGPA C = new SortingStudentsByGPA();
        C.MassPlusPlus(A,B);
        System.out.println("\nSort list A + B by GPA:\n");
        C.quicksortGPA();
        C.outArray();
    }
}
