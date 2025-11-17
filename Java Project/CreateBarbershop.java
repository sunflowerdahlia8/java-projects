import java.util.Scanner;
public class CreateBarbershop {
    public static void main(String[] args){

        String serviceDescription;
        double price;

        Scanner keyboard = new Scanner(System.in);

        BarbershopService firstService = new BarbershopService();
        BarbershopService secondService = new BarbershopService();

        System.out.print("Enter the first service description: ");
        serviceDescription = keyboard.nextLine();
        System.out.print("Enter the price for the first service: ");
        price = keyboard.nextDouble();
        keyboard.nextLine();

        firstService.setServiceDescription(serviceDescription);
        firstService.setPrice(price);

        System.out.print("Enter the second service description: ");
        serviceDescription = keyboard.nextLine();
        System.out.print("Enter the price for the second service: ");
        price = keyboard.nextDouble();
        keyboard.nextLine();

        secondService.setServiceDescription(serviceDescription);
        secondService.setPrice(price);

        System.out.println("\nFirst Service Details:");
        System.out.println("Service: " + firstService.getServiceDescription());
        System.out.println("Price: $" + firstService.getPrice());

        System.out.println("\nSecond Service Details:");
        System.out.println("Service: " + secondService.getServiceDescription());
        System.out.println("Price: $" + secondService.getPrice());

        keyboard.close();
    }
}
