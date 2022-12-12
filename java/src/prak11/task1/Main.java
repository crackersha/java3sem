package prak11.task1;
import java.util.Date;
/*Написать программу, выводящую фамилию разработчика, дату и время получения задания,
а также дату и время сдачи задания. Для получения последней даты и времени использовать
класс Date из пакета java.util.* (Объявление Dated=newDate() или метод System.currentTimeMillis().*/

public class Main {
    public static void main(String[] args){
        String day7 = "Mon";
        String month = "Oct";
        int day = 17;
        int hour = 12;
        int minute = 20;
        int second = 47;
        int year = 2022;
        System.out.printf("Yakovleva %s %s %s %s:%s:%s MSK %s%n", day7, month, day, hour, minute, second, year);
        Date date = new Date();
        System.out.println(date);
    }
}