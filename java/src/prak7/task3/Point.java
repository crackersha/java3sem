package prak7.task3;

/*Добавьте в класс параметризированные конструкторы, входящие в
состав классов; метод в классах для перевода числовых значений в Строку.
Убедитесь, что две точки имеют одну и ту же скорость при помощи специального
логического метода SpeedTest(), проверяющего это.*/

public class Point {
    private double position;

    public Point(){}
    public Point(double position){
        this.position = position;
    }

    public static boolean SpeedTest(Point a, Point b){
        if (a.position == b.position)
            return true;
        else
            return false;
    }

    public String toString() {
        return "Point {" + "position = " + position + '}';
    }
}
