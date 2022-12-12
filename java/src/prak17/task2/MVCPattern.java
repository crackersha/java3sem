package prak17.task2;

/*Напишите реализацию программного кода, с использованием
паттерна MVC для расчета заработной платы сотрудника предприятия.
Предлагается использовать следующие классы.
o Класс Employee – сотрудник будет выступать в качестве слоя модели
o Класс EmployeeView будет действовать как слой представления.
o Класс EmployeeContoller будет действовать как уровень контроллера.*/

public class MVCPattern {
    public static void main(String[] args) {
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(view);
        System.out.println(controller.getSalaryMonth());
    }
}