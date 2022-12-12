package prak14.task4;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*Дан текст, необходимо проверить есть ли в тексте цифры, за которыми не стоит знак «+».
a) пример правильных выражений:(1 + 8) – 9 / 4
b) пример неправильных выражений: 6 / 5 – 2 * 9*/

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(\\w?\\s*\\d+\\s*\\+\\s*\\d+\\s*\\w?)");
        Matcher m1 = p1.matcher(str);
        boolean a = false;
        while (m1.find()) {
            a = true;
        }
        if (a == true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
