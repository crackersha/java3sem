package prak13.task1;

/*
1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
2. Распечатать последний символ строки. Используем метод String.charAt().
3. Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
4. Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
7. Заменить все символы “а” на “о”.
8. Преобразуйте строку к верхнему регистру.
9. Преобразуйте строку к нижнему регистру.
10. Вырезать строку Java c помощью метода String.substring().
*/

public class Main {
    public static void main(String[] args) {
        Test A = new Test("I like Java!!!");
        System.out.println(A.getString());

        System.out.println(A.getString().charAt(A.BackIndex()));

        System.out.println(A.getString().endsWith("!!!"));

        System.out.println(A.getString().startsWith("Java"));

        A.setString("I like Java!!!");
        System.out.println(A.getString().contains("Java"));

        System.out.println(A.getString().indexOf("Java"));

        A.setString(A.getString().replace("a", "o"));
        System.out.println(A.getString());

        A.setString(A.getString().toUpperCase());
        System.out.println(A.getString());

        A.setString(A.getString().toLowerCase());
        System.out.println(A.getString());

        A.setString("I like Java!!!");
        Test B = new Test(A.getString().substring(A.getString().indexOf("Java"), A.getString().indexOf("Java") + 4));
        System.out.println(B.getString());
    }
}