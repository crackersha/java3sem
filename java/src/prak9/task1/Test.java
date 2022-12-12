package prak9.task1;

public class Test {
    private Student[] students;
    private int N;

    public Test(int N) {
        this.N = N;
        students = new Student[N];
        for(int i = 0; i < N; ++i)
        {
            students[i] = new Student();
        }
    }

    public String toString() {
        String mass = "";
        for(int i = 0; i < N; ++i)
        {
            mass += ("N: " + i + " iDNumber: " + this.students[i].getiDNumber() + " GPA: " + (float)(this.students[i].getGPA()) / 100. + "\n");
        }
        return mass;
    }

    public void sort() {
        for (int i = 0; i < N; ++i)
        {
            int value = students[i].getiDNumber();
            int gpa = students[i].getGPA();
            int j = i - 1;
            for (; j >= 0; j--)
            {
                if (value < students[j].getiDNumber())
                {
                    students[j + 1].setiDNumber(students[j].getiDNumber());
                    students[j + 1].setGPA(students[j].getGPA());
                } else
                {
                    break;
                }
            }
            students[j + 1].setiDNumber(value);
            students[j + 1].setGPA(gpa);
        }
    }
}
