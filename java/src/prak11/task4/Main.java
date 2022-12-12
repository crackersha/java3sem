package prak11.task4;
import java.util.Scanner;

/*Напишите пользовательский код, который формирует объекты Date и Calendar по следующим данным,
вводимым пользователем:
<Год><Месяц><Число>
<Часы1><минуты>*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Date = "";
        String Calendar = "";
        System.out.print("Введите год, месяц и день: ");
        String app1 = scanner.nextLine();
        Date += app1;
        System.out.print("Введите время(час и минута): ");
        String app2 = scanner.nextLine();
        Calendar += app2;
        System.out.println(Date);
        System.out.println(Calendar);
        scanner.close();
    }
}