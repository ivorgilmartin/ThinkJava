import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * Draws the flag of Japan.
 * @author ivorgilmartin
 */
public class JapaneseFlag extends Canvas{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Japanese Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas japaneseFlag = new JapaneseFlag();
        japaneseFlag.setSize(600, 400);
        japaneseFlag.setBackground(Color.WHITE);
        frame.add(japaneseFlag);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Draws the flag of Japan. 
     */
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(200, 100, 200, 200);
    }

}
