package prak5.task3;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/* Создать окно, отобразить в нем картинку, путь к которой указан в
аргументах командной строки.*/

public class task3 {
    public task3() {
    }

    public static void ImgPerRef() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес: ");
        String IMG_PATH = scanner.nextLine();

        try {
            BufferedImage img = ImageIO.read(new File(IMG_PATH));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog((Component)null, label);
        } catch (IOException a) {
            a.printStackTrace();
        }

    }
}