
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;

public class FollowMe extends javax.swing.JApplet implements MouseMotionListener {
    //Hello word
    private final JLabel lblHello = new JLabel("Hello");
    //Constructor.
    @Override
    public void init() {
        // using this layout centers the word on the screen.
        setLayout(new GridBagLayout());
        // add button.
        add(lblHello);
        // attach motion listener to Applet.
        addMouseMotionListener(this);
        
        
    }
    // Call Paint to repaint the screen.
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
    // Stub, not used.
    @Override
    public void mouseDragged(MouseEvent e) {
    }
    // Call to reset the label on the screen and have it repainted.
    @Override
    public void mouseMoved(MouseEvent e) {
        lblHello.setLocation(e.getX() + 20, e.getY());
        repaint();
    }

}
