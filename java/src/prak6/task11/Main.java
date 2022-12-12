package prak6.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature temperature = new Temperature();
        System.out.println("Введите температуру в градусах Цельсия: ");
        System.out.println(temperature.convert(scanner.nextInt()));
    }
}
