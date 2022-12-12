package prak3.MathAndRandom;

/*Создать массив вещественных чисел случайным образом, вывести его
на экран, отсортировать его, и снова вывести на экран (использовать два подхода
к генерации случайных чисел – метод random() класса Math и класс Random)*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random m = new Random();
        int mas[]= new int[n];
        System.out.print("Случайный массив: ");
        for (int i = 0; i < n; i++) {
            mas[i] = m.nextInt(100);
            System.out.print(mas[i] + " ");
        }

        System.out.print("\nОтсортированный массив: ");
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

    }
}