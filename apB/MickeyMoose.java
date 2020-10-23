import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;

/**
 * Draws "Mickey Moose".
 * @author ivorgilmartin
 */
public class MickeyMoose extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mickey Moose");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new MickeyMoose();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Draws "Mickey Moose".
     */
    public void paint(Graphics g) {
        Rectangle bb = new Rectangle(100, 100, 200, 200);
        moosey(g, bb);
    }

    /**
     * Draws a solid circle.
     */
    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    /**
     * Recursive method that draws circles inside rectangles.
     */
    public void moosey(Graphics g, Rectangle bb) {
        boxOval(g, bb);

        int dx = bb.width / 2;
        int dy = bb.height / 2;
        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

        half.translate(-dx / 2, -dy / 2);
        boxOval(g, half);
        if(dx > 3) {
            moosey(g, half);
        }
        half.translate(dx * 2, 0);
        boxOval(g, half);
        if(dx > 3) {
            moosey(g, half);
        }

    }

}
