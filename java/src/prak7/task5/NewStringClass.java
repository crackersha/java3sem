package prak7.task5;

/*Разработайте интерфейс для работы со строками, который содержит
а) функции подсчета символов в строке
б) функция возвращает строку, которая
образовывает строку, состоящую из символов исходной строки s, которые
размещены на нечетных позициях: 1, 3, 5, ...
в) функцию инвертирования строки */

public class NewStringClass implements  NewString {
    private String string;

    public NewStringClass(String Length) {
        string = Length;
    }

    public int Length() {
        return string.length();
    }

    public String Odd() {
        String str = "";

        for (int i = 0; i < string.length(); i+= 2) {
            str += string.charAt(i);
        }
        return str;
    }

    public String Invert() {
        String str = "";

        for (int i = string.length() - 1; i >= 0; i--){
            str += string.charAt(i);
        }
        return str;
    }
}
