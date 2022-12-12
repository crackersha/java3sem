package prak11.task3and5;

/*Доработайте класс Student предусмотрите поле для хранения даты рождения, перепишите метод toString()
 таким образом, чтобы он разработайте метод, возвращал строковое представление даты рождения по вводимому
  в метод формату даты (например, короткий, средний и полный формат даты).
 */

import java.util.Date;
import prak9.task2.SortingStudentsByGPA;

public class Main {
    public static void main(String[] args)
    {
        SortingStudentsByGPA A = new SortingStudentsByGPA(5);
        System.out.println(A.toString());
        Date date1 = new Date();
        A.sort(0, 4);
        Date date2 = new Date();
        System.out.println(A.toString());
        System.out.println(date2.getSeconds() - date1.getSeconds());
    }
}