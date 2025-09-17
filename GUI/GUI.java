import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    Randomgenerator rand = new Randomgenerator();
    JFrame fenster = new JFrame();
    JPanel mPanel = new JPanel();
    JLabel mLabel = new JLabel("Button nicht geklickt!");
    JButton mButton = new JButton("Klick");
    JButton mRandom = new JButton("Zufallszahl generieren");

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setLocation(100, 100);
        fenster.add(mPanel);

        mPanel.add(mButton);
        mPanel.add(mRandom);
        mPanel.add(mLabel);

        mButton.addActionListener(this);
        mRandom.addActionListener(this);

        fenster.pack();
        fenster.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.mButton) {
            mLabel.setText("Klicke woanders");
        }

        if (e.getSource() == this.mRandom) {
            rand.generateRandom();
            int tmp = rand.getRandom();
            mLabel.setText("Zufall: " + tmp);
        }
    }
}
