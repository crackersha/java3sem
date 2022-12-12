package prak25.task4;

/*4. Создать запрос для вывода только правильно написанных выражений со
скобками (количество открытых и закрытых скобок должно быть одинаково).
– пример правильных выражений: (3+5)–9×4.
– пример неправильных выражений: ((3+5)–9×4.
*/

import java.util.Scanner;

public class Main {
    private static String s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        System.out.println(check(s));
    }

    private static boolean check(String s) {
        return 0 == s.chars()
                .mapToObj(Character::toString)
                .filter("()"::contains)
                .map("("::equals)
                .mapToInt(b -> b ? 1 : -1)
                .reduce(0, (x, y) -> (x >= 0 && x + y >= 0) ? x + y : -1);
    }
}