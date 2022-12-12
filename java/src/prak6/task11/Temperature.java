package prak6.task11;

/*Напишите программу для перевода температуры по Цельсию в
температуру по Кельвину и Фаренгейту. Для этого добавьте интерфейс
Convertable у которого есть метод convert для конвертации из одной системы
измерения в другую. */

public class Temperature implements Convertable {
    public String convert(double temperature) {
        return "По Кельвину: " + (temperature + 273) + " Градусов\nПо Фарингейту: " + (temperature * 1.8 + 32) + " Градусов";
    }
}
