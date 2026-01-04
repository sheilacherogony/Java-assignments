import javax.swing.*;

public class SwingStructure {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Swing Structure");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();

        // Create components
        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Submit");

        // Add components to panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Add panel to frame
        frame.add(panel);

        // Set frame visible
        frame.setVisible(true);
    }
}
