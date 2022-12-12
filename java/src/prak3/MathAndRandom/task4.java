package prak3.MathAndRandom;
import java.util.Arrays;
import java.util.Scanner;

/*Пользователь должен ввести с клавиатуры размер массива -
натуральное число больше, так чтобы введенное пользователем число
сохранялось в переменную n. Если пользователь ввел не подходящее число, то
программа должна просить пользователя повторить ввод. Создать массив из n
случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
массив только из четных элементов первого массива, если они там есть, и
вывести его на экран.
 */

public class task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n = 0;

        while (n <= 1) {
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n <= 1){
                    System.out.println("Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int [] mas1 = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            mas1[i] = (int)(Math.random() * (n + 1));
            if(mas1[i] % 2 == 0){
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(mas1));
        int [] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(mas1[i] % 2 == 0){
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}