package javaawt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaAWT extends JFrame {
    // Define components
    JFrame outputFrame = new JFrame();
    JPanel inputPanel = new JPanel();
    JPanel outputPanel = new JPanel();

    JTextField inputField = new JTextField(20);
    JLabel inputLabel = new JLabel("Enter Host Address: ");
    JTextArea outputArea = new JTextArea(5, 15);

    JButton btnFindIp = new JButton("Find IP");
    JButton btnClear = new JButton("Clear");
    JButton btnOkay = new JButton("Okay");

    Font setFont = new Font("", Font.BOLD, 14);

    // Constructor
    public JavaAWT() {
        // Set up the main input frame
        this.setSize(280, 150);
        this.setLocation(200, 200);
        this.setTitle("INPUT");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components to input panel
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(btnFindIp);
        inputPanel.add(btnClear);

        // Add action listeners
        btnFindIp.addActionListener(new BtnFindIp());
        btnClear.addActionListener(new BtnClear());

        // Add input panel to frame and display it
        this.add(inputPanel);
        this.setVisible(true);
    }

    // Button listeners as inner classes
    class BtnFindIp implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {
            try {
                String host = inputField.getText();
                String ip = java.net.InetAddress.getByName(host).getHostAddress();
                outputArea.setText("Host Address:\n " + host + "\n\nIP Address:\n " + ip);
            } catch (Exception ex) {
                System.out.println(ex);
                outputArea.setText("Invalid Host Address");
            }

            // Set up output frame on first use
            if (!outputFrame.isVisible()) {
                outputFrame.setSize(230, 185);
                outputFrame.setLocation(430, 240);
                outputFrame.setTitle("OUTPUT");
                outputFrame.setResizable(false);
                outputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Configure output area and panel
                outputArea.setEditable(false);
                outputArea.setBackground(Color.LIGHT_GRAY);
                outputArea.setFont(setFont);

                outputPanel.add(outputArea);
                outputPanel.add(btnOkay);

                // Add panel to output frame and display it
                outputFrame.add(outputPanel);
                outputFrame.setVisible(true);

                // Add action listener to okay button
                btnOkay.addActionListener(new BtnOkay());
            }
            btnFindIp.setEnabled(false);
        }
    }

    class BtnClear implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
            outputArea.setText("");
            btnFindIp.setEnabled(true);
            outputFrame.dispose(); // Close output frame if it's open
        }
    }

    class BtnOkay implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent i) {
            inputField.setText("");
            outputArea.setText("");
            btnFindIp.setEnabled(true);
            outputFrame.dispose(); // Close output frame
        }
    }

    public static void main(String[] args) {
        new JavaAWT();
    }
}
