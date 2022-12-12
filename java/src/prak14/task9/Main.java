package prak14.task9;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

/*Постройте частотный словарь 9 букв русского (или английского) алфавита. Здесь не
имеет значения проблема выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).*/

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("((^)|(\\W))((the)|(be)|(of)|(and)|(a)|(in)|(to)|(have)|(it))\\W+");
        Matcher m1 = p1.matcher(str);
        ArrayList<String> ans = new ArrayList<>();
        while (m1.find()) {
            ans.add(m1.group());
        }
        System.out.println(ans);
    }
}