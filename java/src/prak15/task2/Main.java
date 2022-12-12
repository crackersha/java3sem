package prak15.task2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/*Разработайте программу выбора меню как на рис. 15.8 ниже. Вам понадобится JComboBox.
При выборе пункта меню должна выводится информация о стране*/

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello world");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(200,150);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.GRAY);
        jPanel.setPreferredSize(new Dimension(200,300));

        String[] items = {
                "Россия",
                "Америка",
                "Китай"
        };

        JLabel jLabel = new JLabel(items[0], JLabel.CENTER);
        jPanel.add(jLabel);

        JComboBox comboBox = new JComboBox(items);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jLabel.setText((String) comboBox.getSelectedItem());
            }
        });
        jPanel.add(comboBox);


        jFrame.getContentPane().add(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
