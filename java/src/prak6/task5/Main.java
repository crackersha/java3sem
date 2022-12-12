package prak6.task5;

public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(5, 10, 5, 3);
        System.out.println(p.toString());
        p.moveRight();
        System.out.println(p.toString());
        p.moveLeft();
        System.out.println(p.toString());
        p.moveUp();
        System.out.println(p.toString());
        p.moveDown();
        System.out.println(p.toString());

        MovableCircle c = new MovableCircle(1, 1, 2, 3, 10);
        System.out.println(c.toString());
        c.moveRight();
        System.out.println(c.toString());
        c.moveLeft();
        System.out.println(c.toString());
        c.moveUp();
        System.out.println(c.toString());
        c.moveDown();
        System.out.println(c.toString());
    }
}