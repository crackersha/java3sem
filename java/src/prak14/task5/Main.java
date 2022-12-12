package prak14.task5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Написать регулярное выражение, определяющее является ли данная строчка датой в формате dd/mm/yyyy.
Начиная с 1900 года до 9999 года.
a) пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
b) пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.*/

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(((0[1-9])|([1-2][0-9])|(3[0-1]))/((0[1-9])|(1[0-2]))/((19)|([2-9][0-9]))[0-9][0-9]\\D*)+");
        Matcher m1 = p1.matcher(str);
        boolean a = m1.matches();
        if (a == true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}