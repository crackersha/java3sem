package prak19.task2;

import java.util.Scanner;

public class LabClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[4];
        students[0] = new Student("Софья",19,"ИКБО-33-21",4.6);
        students[1] = new Student("Кирилл",20,"ИКБО-03-21",4.4);
        students[2] = new Student("Олег",20,"ИКБО-03-21",4);
        students[3]= new Student("Анна",19,"ИКБО-04-22",4.1);
        LabClassDriver labClassDriver = new LabClassDriver();
        System.out.print("Введите имя для поиска: ");
        Student temp  = labClassDriver.search(in.nextLine(),students);
        System.out.println(temp);

        System.out.println("\nСписок до сортировки:");
        for (int i = 0; i < 4; i++)
            System.out.println(students[i]);
        students = labClassDriver.sort(students);
        System.out.println("\nСписок после сортировки:");
        for (int i = 0; i < 4; i++)
            System.out.println(students[i]);
    }
}