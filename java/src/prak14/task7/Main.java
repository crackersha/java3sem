package prak14.task7;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Проверить, надежно ли составлен пароль. Пароль считается
надежным, если он состоит из 8 или более символов. Где символом может быть цифр,
английская буква, и знак подчеркивания. Пароль должен содержать хотя бы одну заглавную букву,
одну маленькую букву и одну цифру.
a) пример правильных выражений: F032_Password, TrySpy1.
b) пример неправильных выражений: smart_pass, A007.*/

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_]{8,}");
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
