package prak7;

import prak7.task3.Point;
import prak7.task4.MathFunc;
import prak7.task5.NewStringClass;

public class Main {

    public static void main(String[] args) {
        //task3
	    Point a = new Point(1.1);
	    Point b = new Point(1.1);

	    if (Point.SpeedTest(a, b))
            System.out.println("Скорость одинакова!");
	    else
            System.out.println("Скорость разная.");

        //task4
        System.out.println();

        MathFunc mathFunc = new MathFunc();
        System.out.println(mathFunc.Abs((double)1/2,(double)Math.sqrt(3)/2));
        System.out.println(mathFunc.Pow((double)1/2,(double) Math.sqrt(3)/2, 20));

        System.out.println();

        //task5
        NewStringClass newStringClass = new NewStringClass("asdfgha");
        System.out.println("Инвертирование: " + newStringClass.Invert());
        System.out.println("Длина строки: " + newStringClass.Length());
        System.out.println("Нечетные: " + newStringClass.Odd());
    }
}
