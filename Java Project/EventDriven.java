import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDriven extends JFrame {

    private JTextField lbFirstName, lbLastName, lbMiddleName, lbMobileNumber, lbEmail;
    private JButton btnSubmit, btnClearAll;
    private JFrame outputFrame;

    public EventDriven() {
        
        setTitle("INPUT");

        JPanel panel = new JPanel(new GridLayout(6, 2));

        panel.add(new JLabel("First Name:"));
        lbFirstName = new JTextField();
        panel.add(lbFirstName);

        panel.add(new JLabel("Last Name:"));
        lbLastName = new JTextField();
        panel.add(lbLastName);

        panel.add(new JLabel("Middle Name:"));
        lbMiddleName = new JTextField();
        panel.add(lbMiddleName);

        panel.add(new JLabel("Mobile Number:"));
        lbMobileNumber = new JTextField();
        panel.add(lbMobileNumber);

        panel.add(new JLabel("E-mail Address:"));
        lbEmail = new JTextField();
        panel.add(lbEmail);

        btnSubmit = new JButton("Submit");
        btnClearAll = new JButton("Clear All");
        panel.add(btnSubmit);
        panel.add(btnClearAll);

        add(panel);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnSubmit.addActionListener(new btnSubmit());
        btnClearAll.addActionListener(new btnClearAll());
    }

    class btnSubmit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            btnSubmit.setEnabled(false);

            outputFrame = new JFrame("OUTPUT");
            outputFrame.setSize(300, 300);
            outputFrame.setLayout(new GridLayout(6, 1));

      
            outputFrame.add(new JLabel("First Name: " + lbFirstName.getText()));
            outputFrame.add(new JLabel("Last Name: " + lbLastName.getText()));
            outputFrame.add(new JLabel("Middle Name: " + lbMiddleName.getText()));
            outputFrame.add(new JLabel("Mobile Number: " + lbMobileNumber.getText()));
            outputFrame.add(new JLabel("E-mail Address: " + lbEmail.getText()));

            JButton btnOkay = new JButton("Okay");
            btnOkay.addActionListener(new btnOkay());
            outputFrame.add(btnOkay);

            outputFrame.setLocationRelativeTo(null);
            outputFrame.setVisible(true);
        }
    }

    class btnClearAll implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            lbFirstName.setText("");
            lbLastName.setText("");
            lbMiddleName.setText("");
            lbMobileNumber.setText("");
            lbEmail.setText("");


            btnSubmit.setEnabled(true);

            if (outputFrame != null) {
                outputFrame.dispose();
            }
        }
    }

    class btnOkay implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (outputFrame != null) {
                outputFrame.dispose();
            }

            lbFirstName.setText("");
            lbLastName.setText("");
            lbMiddleName.setText("");
            lbMobileNumber.setText("");
            lbEmail.setText("");

            btnSubmit.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        EventDriven frame = new EventDriven();
        frame.setVisible(true);
    }
}
