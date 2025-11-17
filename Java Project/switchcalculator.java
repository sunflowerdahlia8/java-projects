import java.util.Scanner;

public class switchcalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Double result;
    System.out.print("Enter first number: ");
    double number1 = input.nextDouble();
    System.out.print("Enter second number: ");
    double number2 = input.nextDouble();
    System.out.print("Choose an operator: ");
    char operator = input.next().charAt(0);

    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
      default:
        System.out.println("Invalid operator.");
        break;
    }

    input.close();
  }
}