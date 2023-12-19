import java.util.Scanner;

class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
}
class ATM extends BankAccount{
    public ATM(double initialBalance) {
        super(initialBalance);
    }
    public void displayMenu() {
        System.out.println("*** Menu ***");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    void checkBalance() {
        double balance = getBalance();
        System.out.println("Current balance: $" + balance);
    }
    void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the deposit amount: $");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            deposit(amount);
            System.out.println("Deposited Successfully");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: $");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            if (withdraw(amount)) {
                System.out.println("withdrawn Successfully");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

public class ATM_Interface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(0);
        ATM atm = new ATM(userAccount.getBalance());
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> atm.checkBalance();
                case 2 -> atm.deposit();
                case 3 -> atm.withdraw();
                case 4 -> System.out.println("Bye!,Thank you!");
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);
        System.out.println();
    }
}