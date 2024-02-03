import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUIFramework extends JFrame {
    private JButton button;
    private JLabel label;

    public SimpleGUIFramework() {
        setTitle("Simple GUI Framework");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        button = new JButton("Click Me");
        label = new JLabel("Hello, GUI!");

        // Add event listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Set layout manager (using FlowLayout as an example)
        setLayout(new FlowLayout());

        // Add components to the frame
        add(button);
        add(label);

        // Set frame properties
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleGUIFramework();
            }
        });
    }
}
