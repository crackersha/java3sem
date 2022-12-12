package prak17.task2;
import java.util.Scanner;

public class EmployeeView {
    public static Scanner in = new Scanner(System.in);

    public void showMessage(String msg){
        System.out.println(msg);
    }

    public EmployeeModel getEmployeeInfo(){
        EmployeeModel employee = new EmployeeModel();
        System.out.println("Введите имя: ");
        employee.setName(in.nextLine());
        System.out.println("Введите количество отработанных дней: ");
        employee.setNumberOfWorkingDays(in.nextInt());
        System.out.println("Введите заработную плату: ");
        employee.setSalary(in.nextLong());
        return employee;
    }

}