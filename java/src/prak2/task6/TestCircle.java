package prak2.task6;

import java.lang.*;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args){
        double r;
        Circle c1 = new Circle(3, 4, 5, "red");
        System.out.println("Длина окружности = " + c1.getC() + " cm");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        r = source.nextDouble();
        c1.setR(r);
        System.out.println(c1);
        System.out.println("\nДлина окружности = " + c1.getC() + " cm");
        System.out.println("\nПлощадь равна = " + c1.getS() + " cm^2");
    }
}