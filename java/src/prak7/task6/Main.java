package prak7.task6;

/*Реализуйте интерфейс в классе ProcessStrings и протестируйте
работу класса */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();
        ProcessStrings str = new ProcessStrings(inp);
        System.out.println(str.getLength());
        System.out.println(str.oddCharacters());
        System.out.println(str.invert());
    }
}