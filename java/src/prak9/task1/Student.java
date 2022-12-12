package prak9.task1;

public class Student {
    private int iDNumber;
    private int GPA;

    public Student() {
        iDNumber = (int) (Math.random() * ((1000) + 1));
        GPA = (int) (Math.random() * (300) + 200);
    }

    public Student(Student A) {
        this.iDNumber = A.getiDNumber();
        this.GPA = A.getGPA();
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }
}