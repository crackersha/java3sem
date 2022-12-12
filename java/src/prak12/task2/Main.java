package prak12.task2;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/*Создать окно, отобразить в нем картинку, путь к которой указан в аргументах командной строки.*/

public class Main extends JFrame {
    protected static Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();
    Main(){
        setLayout(new FlowLayout());
        setSize(800,1120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 800, 1120, null);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес: ");
        String IMG_PATH = scanner.nextLine();
        framlist.add(new ImageIcon(IMG_PATH).getImage());
        //   /Users/sofia/Documents/crackersha/HTML/8/mp51.jpeg

        Main animImg = new Main();
        while (true) {
            for (int i = 0; i < 72; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(85);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}