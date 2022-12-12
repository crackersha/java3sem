package prak3.MathAndRandom;
/*Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку, далее определите и выведите на экран сообщение
о том, является ли массив строго возрастающей последовательностью.*/

public class task3 {
    public static void main(String[] args){
        int[] mas = new int[4];

        for (int i = 0; i < 4; i++){
            mas[i] = (int)(Math.random() * 90 + 10);
            System.out.print(mas[i] + " ");
        }

        for (int i = 0; i < 4; i++){
            if (i > 0){
                if (mas[i - 1] >= mas[i]){
                    System.out.println("\nПрогрессия не возрастающая");
                    break;
                }
            }

            if (i == 3)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}
