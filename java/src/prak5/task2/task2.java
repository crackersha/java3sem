package prak5.task2;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*Создать окно, нарисовать в нем 20 случайных фигур, случайного
цвета. Классы фигур должны наследоваться от абстрактного класса Shape, в
котором описаны свойства фигуры: цвет, позиция*/

public class task2 extends JFrame {
    public task2() {
        this.setSize(300, 300);
        this.setVisible(true);
        Frame frame = new Frame();
        frame.setBounds(0, 0, 300, 300);
        this.add(frame);
        frame.paintComponent(frame.getGraphics());
    }

    class Frame extends JPanel {
        Frame() {
        }

        public void paintComponent(Graphics g) {

            for(int i = 0; i < 20; ++i) {
                switch ((int)(Math.random() * 2)) {
                    case 0:
                        (new Rectangle((int)(Math.random() * 250.0), (int)(Math.random() * 250.0), (int)(Math.random() * 40.0 + 10.0), (int)(Math.random() * 40.0 + 10.0))).Draw(g);
                        break;
                    case 1:
                        (new Circle((int)(Math.random() * 250.0), (int)(Math.random() * 250.0), (int)(Math.random() * 30.0 + 10.0))).Draw(g);
                }
            }
        }
    }
}