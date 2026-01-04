import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComprehensiveSwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Full Swing Example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 5, 5));

        // Name + Submit
        panel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        panel.add(nameField);
        JButton submitBtn = new JButton("Submit");
        panel.add(submitBtn);
        panel.add(new JLabel(""));

        // Username + Password + Login
        panel.add(new JLabel("Username:"));
        JTextField userField = new JTextField();
        panel.add(userField);

        panel.add(new JLabel("Password:"));
        JPasswordField passField = new JPasswordField();
        panel.add(passField);

        JButton loginBtn = new JButton("Login");
        panel.add(loginBtn);
        panel.add(new JLabel(""));

        // Checkbox
        JCheckBox terms = new JCheckBox("Accept Terms");
        panel.add(terms);
        panel.add(new JLabel(""));

        // Radio Buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        panel.add(male);
        panel.add(female);

        // Combo Box
        panel.add(new JLabel("Language:"));
        JComboBox<String> combo = new JComboBox<>(new String[] { "Java", "Python", "C++" });
        panel.add(combo);

        // Calculator display
        JTextField calcDisplay = new JTextField();
        panel.add(calcDisplay);
        panel.add(new JLabel(""));

        // Calculator buttons
        JPanel calcPanel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "+", "=", "C"
        };

        for (String text : buttons) {
            JButton b = new JButton(text);
            calcPanel.add(b);
            b.addActionListener(e -> {
                if (text.equals("C")) {
                    calcDisplay.setText("");
                } else {
                    calcDisplay.setText(calcDisplay.getText() + text);
                }
            });
        }

        // Click Me button
        JButton clickMe = new JButton("Click Me");
        clickMe.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Exit"));
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(calcPanel, BorderLayout.CENTER);
        frame.add(clickMe, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
