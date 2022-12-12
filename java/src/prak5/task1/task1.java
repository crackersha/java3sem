package prak5.task1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Напишите интерактивную программу с использованием GUI
имитирует таблицу результатов матчей между командами Милан и Мадрид.
Порядок работы: 1) Создайте пользовательское JFrame приложение, у которого
есть следующие компоненты GUI:
• одна кнопка JButton подписана “AC Milan”
• другая JButton подписана “Real Madrid”
• надпись JLabel содержит текст “Result: 0 X 0”
• надпись JLabel содержит текст “Last Scorer: N/A”
• надпись Label содержит текст “Winner: DRAW”;
Всякий раз, когда пользователь нажимает на кнопку AC Milan, результат
будет увеличиваться для Милана, сначала 1 X 0, затем 2 X 0 и так далее. Last
Scorer означает последнюю забившую команду. В этом случае: AC Milan. Если
пользователь нажимает кнопку для команды Мадрид, то счет приписывается ей.
Победителем становится команда, которая имеет больше кликов кнопку на
соответствующую, чем другая. */

public class task1 extends JFrame {
    int MadridScore = 0;
    int MilanScore = 0;

    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JLabel result = new JLabel("Result: 0 X 0");

    JButton milanBtn = new JButton("AC Milan");
    JButton madridBtn = new JButton("Real Madrid");

    JPanel[] pnl = new JPanel[6];

    public task1() {

        setLayout(new GridLayout(2, 3));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[3].setLayout(new BorderLayout());
        pnl[5].setLayout(new BorderLayout());

        pnl[0].add(lastScorer);
        pnl[2].add(winner);
        pnl[3].add(milanBtn, BorderLayout.CENTER);
        pnl[4].add(result);
        pnl[5].add(madridBtn, BorderLayout.CENTER);

        ActionListener milanActionListener = new MilanActionListener();
        ActionListener madridActionListener = new MadridActionListener();
        milanBtn.addActionListener(milanActionListener);
        madridBtn.addActionListener(madridActionListener);
        setSize(800, 500);
    }

    public String getWinner(){
        if (MilanScore > MadridScore) {
            return "AC Milan";
        } else if (MilanScore < MadridScore){
            return "Real Madrid";
        } else {
            return "Draw";
        }
    }

    public class MadridActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MadridScore++;
            result.setText("Result: " + MilanScore + " X " + MadridScore);
            winner.setText("Winner: " + getWinner());
            lastScorer.setText("Last Scorer: Real Madrid");
        }
    }

    public class MilanActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MilanScore++;
            result.setText("Result: " + MilanScore + " X " + MadridScore);
            winner.setText("Winner: " + getWinner());
            lastScorer.setText("Last Scorer: AC Milan");
        }
    }

}