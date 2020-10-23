import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;

/**
 * Draws "Moire patterns".
 * @author ivorgilmartin
 */
public class MoirePatterns extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moire Pattern");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new MoirePatterns();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Draws concentric circles that create a Moire Pattern.
     */
    public void concentric(Graphics g) {
        int i = 10;
        while (i < getWidth()) {
            g.drawOval(i, i, this.getHeight() - 2 * i, this.getWidth() - 2 * i);
            i = i + 3;
        }
    }

    /**
     * Draws a radial set of line segments that create a Moire Pattern.
     */
    public void radial(Graphics g) {
        int i = 0;
        while (i <= getWidth()) {
            g.drawLine(0, i, this.getHeight(), this.getWidth() - i);
            g.drawLine(i, 0, this.getHeight() - i, this.getWidth());
            i = i + 10;
        }
    }

    /**
     * Draws rectangles that create a Moire Pattern.
     */
    public void rectangles(Graphics g) {
        int i = 10;
        while (i < getWidth()) {
            g.drawRect(i, i, this.getHeight() - 2 * i, this.getWidth() - 2 * i);
            i = i + 3;
        }
    }

    /**
     * Draws the Moire pattern.
     */
    public void paint(Graphics g) {
        // rectangles(g);
        // concentric(g);
        radial(g);
    }

}
