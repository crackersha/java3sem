package prak3.Obolochka;
/*
1. Создайте объекты класса Double, используя методы valueOf().
2. Преобразовать значение типа String к типу double. Используем
метод Double.parseDouble().
3. Преобразовать объект класса Double ко всем примитивным типам.
4. Вывести значение объекта Double на консоль.
5. Преобразовать литерал типа double к строке: String d =
Double.toString(3.14);*/


public class task1 {
    public static void main(String[] args) {
        Double k = Double.valueOf(5);
        System.out.println(k);

        String text = "12.34";
        double value = Double.parseDouble(text);
        System.out.println(value);

        double d = 12.34;
        System.out.println("Первончальное значение double: " + d);

        int i = (int) d;
        System.out.println("Значение double в int: " + i);

        float f = (float) d;
        System.out.println("Значение double в float: " + f);

        byte b = (byte) d;
        System.out.println("Значение double в byte: " + b);

        long l = (long) d;
        System.out.println("Значение double в long: " + l);

        short s = (short) d;
        System.out.println("Значение double в short: " + s);

        char c = (char) d;
        System.out.println("Значение double в char: " + c);

        String total2 = Double.toString(d);
        System.out.println("Значение double в string: " + total2);
    }
}
