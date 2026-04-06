import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI extends JFrame implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JButton upButton, downButton, resetButton;

    public CounterGUI() {
        // Set title
        setTitle("Counter");

        // Set layout
        setLayout(new FlowLayout());

        // Create label
        label = new JLabel("0");
        label.setFont(new Font("Arial", Font.BOLD, 30));
        add(label);

        // Create buttons
        upButton = new JButton("Count Up");
        downButton = new JButton("Count Down");
        resetButton = new JButton("Reset");

        // Add buttons
        add(upButton);
        add(downButton);
        add(resetButton);

        // Add action listeners
        upButton.addActionListener(this);
        downButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Frame settings
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Action handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == upButton) {
            count++;
        } else if (e.getSource() == downButton) {
            count--;
        } else if (e.getSource() == resetButton) {
            count = 0;
        }
        label.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new CounterGUI();
    }
}