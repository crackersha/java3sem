package prak12.task1;
import javax.swing.*;
import java.awt.*;

/*1. Создать окно, нарисовать в нем 20 случайных фигур, случайного цвета. Классы фигур должны
наследоваться от абстрактного класса Shape, в котором описаны свойства фигуры: цвет, позиция.*/

public class Main extends JFrame {

    public Main()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920,1080);
        setVisible(true);
    }

    public static Shape toRandomizeShape()
    {
        int rand = (int)(Math.random() * 2);
        if (rand == 0)
            return new Rectangle();
        else
            return new Circle();
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        int x = 20;
        for (int i = 0; i < 10; ++i, x += 170) {
            int y = 50;
            for (int j = 0; j < 2; ++j, y += 150) {
                // Случайный цвет
                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);

                // Случайная фигура
                Shape sh = toRandomizeShape();
                sh.setXY(x, y);
                sh.setColor(new Color(red, green, blue));

                // Отрисовка
                g.setColor(sh.getColor());
                if (sh.getClass().getSimpleName().equals("Rectangle"))
                    g.fillRect(sh.getX(), sh.getY(), (int)(Math.random() * 150.0 + 10.0), (int)(Math.random() * 100.0 + 10.0));
                else if (sh.getClass().getSimpleName().equals("Circle"))
                    g.fillOval(sh.getX(), sh.getY(), (int)(Math.random() * 100.0 + 10.0), (int)(Math.random() * 100.0 + 10.0));
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                Main tw = new Main();
            }
        });
    }
}