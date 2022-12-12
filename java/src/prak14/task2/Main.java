package prak14.task2;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*Написать регулярное выражение, определяющее является ли данная строка строкой "abcdefghijklmnopqrstuv18340" или нет.
a) пример правильных выражений: abcdefghijklmnopqrstuv18340
b) пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340.*/

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m1 = p1.matcher( str );
        boolean b = m1.matches();
        System.out.println(b);
    }
}
