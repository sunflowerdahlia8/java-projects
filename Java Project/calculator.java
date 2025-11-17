import javax.swing.*;

public class calculator {
    public static void main(String[] args){

        String num1 = JOptionPane.showInputDialog("Enter the first number: ");
        String Operation = JOptionPane.showInputDialog("Enter operation: \n+ \n- \n* \n/ \n%");
        String num2 = JOptionPane.showInputDialog("Enter the second number: ");

        float number1 = Float.parseFloat(num1);
        float number2 = Float.parseFloat(num2);

        float result = 0;
        if (Operation.equals("+")) {
            float add = number1 + number2;
            result = add;
        }
        else if (Operation.equals("-")) {
            float sub = number1 - number2;
            result = sub;
        }
        else if (Operation.equals("*")) {
            float mul = number1 * number2;
            result = mul;
        }
        else if (Operation.equals("/")) {
            float div = number1 / number2;
            result = div;
        }
        else if (Operation.equals("%")) {
            float mod = number1 % number2;
            result = mod;
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Operation");

        }
        JOptionPane.showMessageDialog(null, "The answer is " + result);
    }
}