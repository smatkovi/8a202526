import java.awt.*;
import javax.swing.*;

public class SmileySwing extends JFrame {

    public SmileySwing() {
        super("Smiley Zeichnung (Swing)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null); // zentriert auf Bildschirm
        add(new ZeichenPanel());
        setVisible(true);
    }

    static class ZeichenPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);  // löscht Hintergrund
            Graphics2D g2 = (Graphics2D) g;

            setBackground(Color.WHITE);

            g2.setColor(Color.YELLOW);
            g2.fillOval(100, 100, 300, 300);

            g2.setColor(Color.GREEN);
            g2.fillArc(150, 150, 80, 80, 45, 270);

            int[] xPoints = {260, 310, 360};
            int[] yPoints = {230, 160, 230};
            g2.setColor(Color.WHITE);
            g2.fillPolygon(xPoints, yPoints, 3);

            g2.setColor(Color.BLACK);
            g2.drawArc(150, 200, 200, 100, 0, -180);
        }
    }

    public static void main(String[] args) {
        new SmileySwing();
    }
}
