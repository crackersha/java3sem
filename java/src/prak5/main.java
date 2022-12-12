package prak5;
import prak5.task1.task1;
import prak5.task2.task2;
import prak5.task3.task3;
import prak5.task4.task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Выберите номер задания (1-4)");
            System.out.println("Или введите 0 для выхода.");
            switch (scanner.nextInt()){
                case 0:
                    System.exit(0);
                case 1:
                    new task1().setVisible(true);
                    break;
                case 2:
                    new task2();
                    break;
                case 3:
                    task3.ImgPerRef();
                    break;
                case 4:
                    task4.Start();
                    break;
            }
        }
    }
}
