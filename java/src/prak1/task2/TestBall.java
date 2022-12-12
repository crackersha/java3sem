package prak1.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();//создаем экземпляры класса
        //Экземпляр класса — это представление (или реализация) конкретного
        //представителя класса.
        System.out.println(b1);
        b1 = new Ball(2, "Yellow");
        System.out.println(b1);
        System.out.println("Ball diameter is " + b1.getDiametr());
    }
}