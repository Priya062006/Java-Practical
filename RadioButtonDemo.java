import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RadioButtonDemo extends JFrame implements ActionListener {

    private JRadioButton male, female, other;
    private JButton submit;

    public RadioButtonDemo() {
        setTitle("Gender Selection");

        // Layout
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

        // Label
        add(new JLabel("Select Gender:"));

        // Radio Buttons
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        // Grouping (only one selectable)
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        // Add to frame
        add(male);
        add(female);
        add(other);

        // Button
        submit = new JButton("Submit");
        add(submit);

        // Action Listener
        submit.addActionListener(this);

        // Frame settings
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String gender = "";

        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()) {
            gender = "Other";
        } else {
            gender = "No selection";
        }

        JOptionPane.showMessageDialog(this, "Selected Gender: " + gender);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}