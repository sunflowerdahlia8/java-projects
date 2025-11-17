import java.util.Scanner;

public class oddeven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number%2==0){
            System.out.println("This is an even number");
        }
        else{
            System.out.println("This is an odd number");
        }
        scan.close();
    }
    
}
