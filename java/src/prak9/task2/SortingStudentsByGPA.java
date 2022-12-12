package prak9.task2;

import prak9.task1.Student;

public class SortingStudentsByGPA implements Comparator{
    private Student[] students;
    private int N;

    public int getLeft()
    {
        return students[0].getGPA();
    }

    public int getRight()
    {
        return students[N - 1].getGPA();
    }


    public SortingStudentsByGPA(int N)
    {
        this.N=N;
        students = new Student[N];
        for(int i = 0; i < N; ++i)
        {
            students[i] = new Student();
        }
    }

    public String toString()
    {
        String mass = "";
        for(int i = 0; i < N; ++i)
        {
            mass += ("N: " + i + " iDNumber: " + this.students[i].getiDNumber() + " GPA: " + (float)(this.students[i].getGPA()) / 100. + "\n");
        }
        return mass;
    }

    public int compare(int x, int y) {
        return x - y;
    }

    public void sort(int leftBorder, int rightBorder) {
        if (N == 0)
        {
            return;
        }
        if (leftBorder >= rightBorder)
        {
            return;
        }
        int middle = leftBorder + (rightBorder - leftBorder)/2;
        Student student = students[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j)
        {
            while (compare(students[i].getGPA(),student.getGPA()) > 0)
            {
                i++;
            }
            while (compare(students[j].getGPA(),student.getGPA()) < 0)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
            if ( leftBorder < j )
            {
                sort(leftBorder,j);
            }
            if (rightBorder > i )
            {
                sort(i,rightBorder);
            }
        }
    }
}