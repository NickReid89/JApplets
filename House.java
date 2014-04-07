
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class House extends javax.swing.JApplet implements MouseListener {

    int[] xTriPoints = {70, 190, 310};
    int[] yTriPoints = {90, 10, 90};
    boolean leftWindow = false;
    boolean door = false;
    boolean rightWindow = false;

    @Override
    public void init() {
        addMouseListener(this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //House walls
        g.drawRect(90, 90, 200, 100);
        //roof.
        g.drawPolygon(xTriPoints, yTriPoints, 3);

        if (!leftWindow) {
            //Open windows and doors.
            //Left window.
            g.drawRect(110, 120, 20, 20);
            g.drawRect(110, 140, 20, 20);
            g.drawRect(130, 120, 20, 20);
            g.drawRect(130, 140, 20, 20);
        }
        if (!rightWindow) {
            //Right Window
            g.drawRect(230, 120, 20, 20);
            g.drawRect(230, 140, 20, 20);
            g.drawRect(250, 120, 20, 20);
            g.drawRect(250, 140, 20, 20);
        }
        if (!door) {
            // Door
            g.drawRect(170, 120, 40, 70);
            g.fillOval(197, 155, 7, 7);
        }

        if (leftWindow) {
            //Left Window.
            g.fillRect(110, 120, 20, 20);
            g.fillRect(110, 140, 20, 20);
            g.fillRect(130, 120, 20, 20);
            g.fillRect(130, 140, 20, 20);
        }
        if (rightWindow) {
            //Right Window
            g.fillRect(230, 120, 20, 20);
            g.fillRect(230, 140, 20, 20);
            g.fillRect(250, 120, 20, 20);
            g.fillRect(250, 140, 20, 20);
        }
        if (door) {
            // Door
            g.fillRect(170, 120, 40, 70);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getX() > 109 && e.getX() < 151 && e.getY() > 119 && e.getY() < 161) {
            leftWindow = !leftWindow;
            repaint();
        } else if (e.getX() > 169 && e.getX() < 210 && e.getY() > 119 && e.getY() < 191) {
            door = !door;
            repaint();
        } else if (e.getX() > 229 && e.getX() < 271 && e.getY() > 119 && e.getY() < 161) {
            rightWindow = !rightWindow;
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
