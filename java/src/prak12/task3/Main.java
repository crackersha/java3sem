package prak12.task3;
import javax.swing.*;
import java.awt.*;

/*Создать окно, реализовать анимацию, с помощью картинки, состоящей из нескольких кадров.*/

public class Main extends JComponent{

    static int imageWidth = 332, imageHeight = 332;
    int grid = 10;
    int imageX, imageY;
    Image image;

    public Main(Image i) {
        image = i;
    }


    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image, imageX, imageY, this);
    }

    public static void main(String[] args) {
        String imageFile = "/Users/sofia/Documents/crackersha/2iFb.gif";
        ImageIcon imageicon = new ImageIcon(imageFile);
        if (args.length > 0) {
            imageFile = args[0];
        }

        Image image = imageicon.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);

        image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);

        JFrame frame = new JFrame();
        frame.add(new Main(image));
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
