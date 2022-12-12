package prak13.task2;

public class Person {
    private String SecondName;
    private String FirstName = "";
    private String Patronymic = "";

    public Person(String SecondName) {
        this.SecondName = SecondName;
    }

    public Person(String SecondName, String FirstName) {
        this(SecondName);
        this.FirstName = FirstName;
    }

    public Person(String SecondName, String FirstName, String Patronymic) {
        this(SecondName, FirstName);
        this.Patronymic = Patronymic;
    }

    public String toString() {
        String A = SecondName;
        if (!FirstName.equals("")) {
            A += " ";
            A += FirstName.substring(0,1);
            A += ".";
            if (!Patronymic.equals("")) {
                A += Patronymic.substring(0,1);
                A += ".";
            }
        }
        return A;
    }
}
