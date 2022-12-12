package prak14.task3;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

/*Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU. пример правильных выражений: 25.98 USD.
пример неправильных выражений: 44 ERR, 0.004 EU.*/

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        // 25.98 USD 2.12 U 25.93 RUB
        Matcher m1 = p1.matcher(str);
        ArrayList<String> ans = new ArrayList<>();
        while (m1.find()) {
            ans.add(m1.group());
        }
        System.out.println(ans);
    }
}