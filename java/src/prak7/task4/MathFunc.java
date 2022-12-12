package prak7.task4;

/*Разработайте интерфейс MathCalculable, который содержит
объявления математических функций: возведения в степень и модуль
комплексного числа, также содержит число PI. Напишите класс MathFunc,
который реализует, реализует этот интерфейс. Например, вычисления длины
окружности, для чего используйте число PI из интерфейса. Протестируйте класс*/

public class MathFunc implements MathCalculable {

    public double getS(double r) {
        return PI * r * r;
    }

    public String Pow(double a, double b, int n) {
        double modZ = Abs(a,b);
        double nA = Math.pow(modZ, n) * Math.cos(n * Math.atan(b/a));
        double nB = Math.pow(modZ, n) * Math.sin(n * Math.atan(b/a));
        return  nA + " " + nB + "i";
    }

    public double Abs(double a, double b) {
        return Math.sqrt(a*a+b*b);
    }
}
