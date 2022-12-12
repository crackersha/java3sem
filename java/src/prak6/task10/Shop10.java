package prak6.task10;

import java.util.Scanner;
import java.util.Vector;



public class Shop10 {
    private static Vector<Computer> CompVect = new Vector<Computer>();

    public static void AddNewComputer(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите марку из списка: ");
        for (Mark mark : Mark.values()) {
            System.out.println(mark);
        }

        String mark = scanner.next();

        try {
            Mark.valueOf(mark);
        } catch (Exception e) {
            System.out.println("Введенной марки не существует !");
            return;
        }

        System.out.println("Введите количество ядер процессора (целое) и их частоту (дробное):");

        int CoreNum = scanner.nextInt();
        double FrequencyP = scanner.nextDouble();

        System.out.println("Введите объем ОЗУ (целое) и ее частоту (дробное):");

        int Volume = scanner.nextInt();
        double FrequencyM = scanner.nextDouble();

        System.out.println("Введите диагональ экрана (дробное):");

        double Diag = scanner.nextDouble();


        CompVect.add(new Computer(Mark.valueOf(mark), CoreNum,  FrequencyP, Volume, FrequencyM, Diag));
    }
    public static void RemoveComputer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс удаляемого компьютера: ");
        CompVect.remove(scanner.nextInt());
    }

    public static void SearchComputer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите марку компьютера: ");
        String mark = scanner.next();
        try {
            Mark.valueOf(mark);
        } catch (Exception e) {
            System.out.println("Введенной марки не существует !");
            return;
        }

        for (int i = 0; i < CompVect.size(); i++){
            if (CompVect.get(i).getMark() == Mark.valueOf(mark)){
                System.out.println(CompVect.get(i));
            }
        }
        System.out.println("Такого компьютера нет.");
    }
}
