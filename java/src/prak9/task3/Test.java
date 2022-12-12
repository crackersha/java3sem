package prak9.task3;

import prak10.task2and3.SortingStudentsByGPA;
import prak9.task1.Student;

public class Test {
    private Student[] OneOld;
    private Student[] TwoOld;
    private Student[] OneNew;

    public Test(int X, int Y) {
        OneOld = new Student[X];
        for (int i = 0; i < X; ++i) {
            OneOld[i] = new Student();
        }
        TwoOld = new Student[Y];
        for (int i = 0; i < Y; ++i) {
            TwoOld[i] = new Student();
        }
    }



    public String toStringOneOld() {
        String mass = "";
        for (int i = 0; i < this.OneOld.length; ++i) {
            mass += ("N: " + i + " iDNumber: " + this.OneOld[i].getiDNumber() + " score: " + (float)(this.OneOld[i].getGPA()) / 100. + "\n");
        }
        return mass;
    }

    public String toStringTwoOld() {
        String mass = "";
        for (int i = 0; i < this.TwoOld.length; ++i) {
            mass += ("N: " + i + " iDNumber: " + this.TwoOld[i].getiDNumber() + " score: " + (float)(this.TwoOld[i].getGPA()) / 100. + "\n");
        }
        return mass;
    }

    public String toStringOneNew() {
        String mass = "";
        for (int i = 0; i < this.OneNew.length; ++i) {
            mass += ("N: " + i + " iDNumber: " + this.OneNew[i].getiDNumber() + " score: " + (float)(this.OneNew[i].getGPA()) / 100.+ "\n");
        }
        return mass;
    }

    public void NewMass() {
        OneNew = new Student[OneOld.length + TwoOld.length];
        for (int i = 0; i < OneOld.length; ++i) {
            OneNew[i] = new Student(OneOld[i]);
        }
        for (int i = OneOld.length; i < OneNew.length; ++i) {
            OneNew[i] = new Student(TwoOld[i - OneOld.length]);
        }

        int[] sort = new int[OneNew.length];
        for (int i = 0; i < OneNew.length; ++i) {
            sort[i] = OneNew[i].getGPA();
        }
        MergeSort(sort, OneNew.length - 1, 0);
        for (int i = 0; i < OneNew.length; ++i) {
            OneNew[i].setGPA(sort[i]);
        }
    }

    //функция слияния двух массивов
    void Merge(int[] x, int left, int middle, int right) {
        int size1 = middle - left + 1;
        int size2 = right - middle;
        int[] leftX = new int[size1];
        int[] rightX = new int[size2];
        for (int i = 0; i < size1; i++) {
            leftX[i] = x[left + i];
        }
        for (int j = 0; j < size2; j++) {
            rightX[j] = x[middle + 1 + j];
        }
        int i = 0;//индекс для прохода по первому массиву
        int j = 0;//индекс для прохода по второму массиву
        int k = left;

        while (i < size1 && j < size2) {
/* мы должны дойти до конца
    хоть одного массива
    мы записываем в наш массив больший из элементов массивов,
    находящихся на позициях i и j и увеличиваем соответственный индекс */
            if (leftX[i] <= rightX[j]) {
                x[k] = leftX[i];
                i++;
            } else {
                x[k] = rightX[j];
                j++;
            }
            k++;
        }
    /*в каком-то из массивов что-то останется,
    это "что-то" дописываем в наш массив"*/
        while (i < size1) {
            x[k] = leftX[i];
            i++;
            k++;
        }
        while (j < size2) {
            x[k] = rightX[j];
            j++;
            k++;
        }
    }

    //функция сортировки
    void MergeSort(int[] x, int right, int left) {
        if (left < right) {
            int middle = (right + left) / 2;
            MergeSort(x, middle, left);
            MergeSort(x, right, middle + 1);
            Merge(x, left, middle, right);
        }
    }
}
