package prak10.task2and3;

import java.util.Scanner;
import prak10.task1.Student;

/*Напишите класс SortingStudentsByGPA (может у вас называться Tester или Main, так как содержит функцию
main()) создайте поле как массив объектов Student с названием iDNumber, вы можете использовать как массив,
так и и ArrayList или TreeSet для хранения данных о студентах
Добавьте методы класса: 1) заполнения массива setArray()
2) метод для сортировки по среднему баллу студентов quicksort()
который реализует интерфейс Comparator таким образом, чтобы он сортировал студентов с их итоговым баллом в порядке убывания.
В качестве алгоритма сортировки использовать методы сортировок: слиянием и быструю сортировку (добавьте в класс еще один метод).
3)метод для вывода массива студентов outArray() 4)Добавьте в класс возможность сортировать список студентов по другому полю*/


/*Напишите программу, которая объединяет два списка данных о студентах в один отсортированный списках.*/

public class SortingStudentsByGPA {
    private Student[] iDNumber;

    public SortingStudentsByGPA() {}

    public void setArray(int N)
    {
        iDNumber = new Student[N];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < iDNumber.length; ++i)
        {
            iDNumber[i] = new Student();
            System.out.print("FirstName: ");
            iDNumber[i].setFirstName(scanner.nextLine());
            System.out.print("SecondName: ");
            iDNumber[i].setSecondName(scanner.nextLine());
            System.out.print("Specialization: ");
            iDNumber[i].setSpecialization(scanner.nextLine());
            System.out.print("Group: ");
            iDNumber[i].setGroup(scanner.nextShort());
            System.out.print("Course: ");
            iDNumber[i].setCourse(scanner.nextByte());
            System.out.print("GPA: ");
            iDNumber[i].setGPA(scanner.nextDouble());
            scanner.nextLine();
            System.out.println();
        }
    }

    public void outArray()
    {
        for(int i = 0; i < iDNumber.length; ++i)
        {
            System.out.println(iDNumber[i].toString());
        }
    }

    public void quicksortGPA()
    {
        sortGPA(0, iDNumber.length-1);
    }

    public void quicksortGroup()
    {
        sortGroup(0, iDNumber.length-1);
    }

    public void quicksortCourse()
    {
        sortCourse(0, iDNumber.length-1);
    }
    private double compare(double x, double y) {
        return x-y;
    }

    private double compare(short x, short y) {
        return x-y;
    }

    private double compare(byte x, byte y) {
        return x-y;
    }

    private void sortGPA(int leftBorder, int rightBorder) {
        if (iDNumber.length == 0)
        {
            return;
        }
        if (leftBorder >= rightBorder)
        {
            return;
        }
        int middle = leftBorder +(rightBorder - leftBorder)/2;
        Student student = iDNumber[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j)
        {
            while (compare(iDNumber[i].getGPA(),student.getGPA())>0)
            {
                i++;
            }
            while (compare(iDNumber[j].getGPA(),student.getGPA()) <0)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
            if ( leftBorder < j )
            {
                sortGPA(leftBorder,j);
            }
            if (rightBorder > i )
            {
                sortGPA(i,rightBorder);
            }
        }
    }

    private void sortGroup(int leftBorder, int rightBorder) {
        if (iDNumber.length == 0)
        {
            return;
        }
        if (leftBorder >= rightBorder)
        {
            return;
        }
        int middle = leftBorder +(rightBorder - leftBorder)/2;
        Student student = iDNumber[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j)
        {
            while (compare(iDNumber[i].getGroup(),student.getGroup())>0)
            {
                i++;
            }
            while (compare(iDNumber[j].getGroup(),student.getGroup()) <0)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
            if ( leftBorder < j )
            {
                sortGroup(leftBorder,j);
            }
            if (rightBorder > i )
            {
                sortGroup(i,rightBorder);
            }
        }
    }

    private void sortCourse(int leftBorder, int rightBorder) {
        if (iDNumber.length == 0)
        {
            return;
        }
        if (leftBorder >= rightBorder)
        {
            return;
        }
        int middle = leftBorder +(rightBorder - leftBorder)/2;
        Student student = iDNumber[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j)
        {
            while (compare(iDNumber[i].getCourse(),student.getCourse())>0)
            {
                i++;
            }
            while (compare(iDNumber[j].getCourse(),student.getCourse()) <0)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
            if ( leftBorder < j )
            {
                sortCourse(leftBorder,j);
            }
            if (rightBorder > i )
            {
                sortCourse(i,rightBorder);
            }
        }
    }

    public void MassPlusPlus(SortingStudentsByGPA A, SortingStudentsByGPA B)
    {
        iDNumber = new Student[A.iDNumber.length + B.iDNumber.length];
        for (int i = 0; i < A.iDNumber.length; ++i)
        {
            iDNumber[i] = new Student(A.iDNumber[i]);
        }
        for (int i = A.iDNumber.length; i < iDNumber.length; ++i)
        {
            iDNumber[i] = new Student(B.iDNumber[i-A.iDNumber.length]);
        }
    }
}