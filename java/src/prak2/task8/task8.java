package prak2.task8;

/*Напишите программу, которая меняет местами элементы
одномерного массива из String в обратном порядке. Не используйте
дополнительный массив для хранения результатов. */

import java.lang.*;

public class task8 {
    public static void main(String[] args){

        String[] a = { " А "," Б "," В "," Г "," Д "," Е ", " Ё "};
        //Выводим изначальный массив в консоль
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
    }
}