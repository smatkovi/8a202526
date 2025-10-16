import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingCircle extends JPanel implements ActionListener {

    private int x = 0;           // aktuelle x-Position
    private final int y = 100;   // feste y-Position
    private final int d = 50;    // Durchmesser
    private final Timer timer;

    public MovingCircle() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.WHITE);

        // Timer ruft alle 15ms actionPerformed auf
        timer = new Timer(15, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, d, d);   // Kreis zeichnen an (x, y)
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // Kreis nach rechts bewegen
        x += 1;
        // wenn rechts raus -> wieder links anfangen
        if (x > getWidth()) {
            x = -d;
        }
        repaint(); // neu zeichnen
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Einfacher bewegter Kreis");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MovingCircle());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
