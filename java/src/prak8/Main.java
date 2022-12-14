package prak8;

    /*15. Задание Цифры числа справа налево
Дано натуральное число N. Выведите все его цифры по одной, в обратном
порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки, массивы (ну
и циклы, разумеется). Разрешена только рекурсия и целочисленная арифметика.

    16. Задание Количество элементов, равных максимуму
Дана последовательность натуральных чисел (одно число в строке),
завершающаяся числом ноль. Определите, какое количество элементов этой
последовательности, равны ее наибольшему элементу.
В этой задаче нельзя использовать глобальные переменные. Функция
получает данные, считывая их с клавиатуры, а не получая их в виде параметра.
В программе на языке Python функция возвращает результат в виде кортежа из
нескольких чисел, и функция вообще не получает никаких параметров. В
программе на языке C++ результат записывается в переменные, которые
передаются в функцию по ссылке. Других параметров, кроме как используемых
для возврата значения, функция не получает. Гарантируется, что
последовательность содержит хотя бы одно число(кроме нуля)

    17. Задание Максимум последовательности
Дана последовательность натуральных чисел (одно число в строке),
завершающаяся числом 0. Определите наибольшее значение числа в этой
последовательности*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 15");
        task15(1213457);
        System.out.println("\nTask 16");
        task16(0,0);
        System.out.println("Task 17");
        System.out.println(task17());
    }

    //числа справа налево
    public static void task15(int n) {
        if (n != 0) {
            System.out.print(n % 10 + " ");
            task15(n / 10);
        }
    }

    //количество элементов, равных максимуму
    public static void task16(int max, int count) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n != 0) {
            if (n > max) {
                task16(n, 1);
            } else if (n == max) {
                task16(max, ++count);
            } else {
                task16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    //максимум последовательности
    public static int task17(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0)
            return 0;
        else
            return Math.max(number, task17());
    }
}
