import java.util.Scanner;

public class BankingSystem {
    static double[] accountBalances = new double[10];
    static String[] accountNames = new String[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        accountNames[0] = "John Doe";
        accountBalances[0] = 5000.00;
        accountNames[1] = "Jane Smith";
        accountBalances[1] = 3000.00;
        accountNames[2] = "Natalia Ferreira";
        accountBalances[2] = 1200000.00;
        accountNames[3] = "Naiyana Carvajal";
        accountBalances[3] = 5200000.00;
        accountNames[4] = "Natalie Imbruglia";
        accountBalances[4] = 16000000.00;
        accountNames[5] = "Lalisa Manobal";
        accountBalances[5] = 14000000.00;
        accountNames[6] = "Jennie Kim";
        accountBalances[6] = 10000000.00;
        accountNames[7] = "Rosalia Vila Tobella";
        accountBalances[7] = 8000000.00;
        accountNames[8] = "Karly Loaiza";
        accountBalances[8] = 4000000.00;
        accountNames[9] = "Tyla Seethal";
        accountBalances[9] = 50000;
       
        System.out.println("Welcome to NZ Express Bank!");
        
        do {
            System.out.println("\n1. View Accounts");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    viewAccounts();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    transferMoney(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the banking system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (option != 5);

        scanner.close();
    }

    public static void viewAccounts() {
        System.out.println("\nAccount Details:");
        for (int i = 0; i < accountNames.length; i++) {
            if (accountNames[i] != null) {
                System.out.printf("%d. %s - Balance: $%.2f%n", i + 1, accountNames[i], accountBalances[i]);
            }
        }
    }

    public static void depositMoney(Scanner scanner) {
        System.out.println("\nDeposit Money");
        System.out.print("Enter account number (1-10): ");
        int accountNumber = scanner.nextInt();

        if (isValidAccount(accountNumber)) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();

            if (amount > 0) {
                accountBalances[accountNumber - 1] += amount;
                System.out.println("Deposit successful! New balance: $" + accountBalances[accountNumber - 1]);
            } else {
                System.out.println("Amount must be greater than 0.");
            }
        } else {
            System.out.println("Invalid account number.");
        }
    }

    public static void withdrawMoney(Scanner scanner) {
        System.out.println("\nWithdraw Money");
        System.out.print("Enter account number (1-10): ");
        int accountNumber = scanner.nextInt();

        if (isValidAccount(accountNumber)) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            if (amount > 0 && amount <= accountBalances[accountNumber - 1]) {
                accountBalances[accountNumber - 1] -= amount;
                System.out.println("Withdrawal successful! New balance: $" + accountBalances[accountNumber - 1]);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("Invalid account number.");
        }
    }

    public static void transferMoney(Scanner scanner) {
        System.out.println("\nTransfer Money");
        System.out.print("Enter sender account number (1-10): ");
        int senderAccount = scanner.nextInt();
        System.out.print("Enter receiver account number (1-10): ");
        int receiverAccount = scanner.nextInt();

        if (isValidAccount(senderAccount) && isValidAccount(receiverAccount)) {
            System.out.print("Enter amount to transfer: ");
            double amount = scanner.nextDouble();

            if (amount > 0 && amount <= accountBalances[senderAccount - 1]) {
                accountBalances[senderAccount - 1] -= amount;
                accountBalances[receiverAccount - 1] += amount;
                System.out.println("Transfer successful!");
                System.out.println("New balance for Sender: $" + accountBalances[senderAccount - 1]);
                System.out.println("New balance for Receiver: $" + accountBalances[receiverAccount - 1]);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("Invalid account number(s).");
        }
    }

    public static boolean isValidAccount(int accountNumber) {
        return accountNumber > 0 && accountNumber <= accountNames.length && accountNames[accountNumber - 1] != null;
    }
}
