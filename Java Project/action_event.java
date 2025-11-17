import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class action_event{
    public static void main(String[] args){

        JFrame frame = new JFrame("Button Action");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton ("Click me!");
        button.setBounds(100, 80, 100, 30);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }

        });
        frame.add(button);
        frame.setVisible(true);
    }
}