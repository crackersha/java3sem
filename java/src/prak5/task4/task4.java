package prak5.task4;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/*Создать окно, реализовать анимацию, с помощью картинки,
состоящей из нескольких кадров.*/
public class task4 extends JFrame {
    private JLabel imgLabel;
    private int imgNum = 1;

    private task4() {
        this.setSize(700, 1000);
        this.imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("1.jpg")));
        this.getContentPane().add(this.imgLabel);
        Timer timer = new Timer(2000, (e) -> { this.nextImg(); });
        timer.start();
    }

    private void nextImg() {
        JLabel img = this.imgLabel;
        Class imgN = this.getClass();
        int imgNN = this.imgNum + 1;
        img.setIcon(new ImageIcon(imgN.getResource((this.imgNum = imgNN) + ".jpg")));
        if (this.imgNum == 3) {
            this.imgNum = 0;
        }
    }

    public static void Start() {
        task4 fourth = new task4();
        fourth.setVisible(true);
    }
}