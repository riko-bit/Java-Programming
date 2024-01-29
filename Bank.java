import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Account Holder: " + accountHolder +
                ", Balance: $" + balance;
    }
}

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(int accountNumber, String accountHolder, double initialBalance) {
        Account account = new Account(accountNumber, accountHolder, initialBalance);
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    public void removeAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                System.out.println("Account removed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public Account findAccount(int accountNumber) {
        if (accounts.isEmpty()) {
            return null;
        }

        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Account Holder's Name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter Initial Balance: $");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine();
                    bank.addAccount(accountNumber, accountHolder, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter Account Number to Remove: ");
                    accountNumber = scanner.nextInt();
                    scanner.nextLine();
                    bank.removeAccount(accountNumber);
                    break;
                case 3:
                    System.out.print("Enter Account Number to Deposit: ");
                    accountNumber = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    Account depositAccount = bank.findAccount(accountNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter Deposit Amount: $");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account Number to Withdraw: ");
                    accountNumber = scanner.nextInt();
                    scanner.nextLine();
                    Account withdrawAccount = bank.findAccount(accountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Enter Withdrawal Amount: $");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
