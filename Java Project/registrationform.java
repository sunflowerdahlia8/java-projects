import java.util.Scanner;

public class registrationform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter your middle name: ");
        String middlename = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastname = scanner.nextLine();
        System.out.print("Enter your full address: ");
        String address = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height (cm): ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your email: ");
        String email = scanner.next();
        System.out.print("Enter your phone number: ");
        String phonenumber = scanner.next();
        System.out.print("Enter your blood type: ");
        String bloodtype = scanner.next();

        System.out.println(" ");
        System.out.println("REGISTRATION FORM");
        System.out.println("First name: " + firstname);
        System.out.println("Middle name: " + middlename);
        System.out.println("Last name: " + lastname);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Email address: " + email);
        System.out.println("Phone number: " + phonenumber);
        System.out.println("Blood type: " + bloodtype);

        scanner.close();


    }
}
