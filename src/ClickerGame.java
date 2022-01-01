import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickerGame implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Total Clicks:    0        ");
    private JFrame frame = new JFrame();

    public ClickerGame() {

        // the clickable button
        JButton button = new JButton("+ 1");
        button.addActionListener(this);

        // the panel with the button and text with
        // settings for Panel size (top, left, bottom, right) in pixels and layout (rows, cols)
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(button);


        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicker Game");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Total Clicks:    " + clicks);
    }

    // create one Frame of ClickerGame
    public static void main(String[] args) {
        new ClickerGame();
    }
}