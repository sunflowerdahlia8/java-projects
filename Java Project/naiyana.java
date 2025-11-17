import javax.swing.JOptionPane;

public class naiyana {
    public static void main(String []args){
        String firstname = JOptionPane.showInputDialog("Enter firstname");
        String middlename = JOptionPane.showInputDialog("Enter Middlename");
        String lastname = JOptionPane.showInputDialog("Enter Lastname");
        String age = JOptionPane.showInputDialog("Enter Age");

        String name1 = new String (firstname);
        String name2 = new String (middlename);
        String name3 = new String (lastname);
        String age1 = new String (age);
        String result  = name1 + " " + name2 + " " + name3;
        String result1 = age1;

        JOptionPane.showMessageDialog(null, "Your fullname " + "is " + result + ". You are " + result1, "Result ", JOptionPane.PLAIN_MESSAGE);
    }
    
}
