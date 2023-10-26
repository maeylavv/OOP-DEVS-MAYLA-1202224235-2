import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String accountInfo() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(String accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
    }

    public Account getAccount(String accountNumber) {
        return accounts.stream().filter(account -> account.getAccountNumber().equals(accountNumber)).findFirst().orElse(null);
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
}

public class BankingSystems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("Choose the operation you want to carry out:");
            System.out.println("1. Add an Account");
            System.out.println("2. Remove an Account");
            System.out.println("3. Get an Account");
            System.out.println("4. List All Accounts");
            System.out.println("5. Execute the transaction");
            System.out.println("6. Exit");

            System.out.print("Choose an operation (1/2/3/4/5/6): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter the account owner's name: ");
                String name = scanner.nextLine();
                System.out.print("Enter the account number: ");
                String accountNumber = scanner.nextLine();
                System.out.print("Enter the starting balance: ");
                double balance = scanner.nextDouble();
                scanner.nextLine(); 

                Account account = new Account(name, accountNumber, balance);
                bank.addAccount(account);
                System.out.println("Account added successfully.");
                System.out.println(account.accountInfo());
            } else if (choice == 2) {
                System.out.print("Enter the account number to remove: ");
                String accountNumberToRemove = scanner.nextLine();
                bank.removeAccount(accountNumberToRemove);
                System.out.println("Account removed successfully.");
            } else if (choice == 3) {
                System.out.print("Enter the account number to get: ");
                String accountNumberToGet = scanner.nextLine();
                Account retrievedAccount = bank.getAccount(accountNumberToGet);
                if (retrievedAccount != null) {
                    System.out.println(retrievedAccount.accountInfo());
                } else {
                    System.out.println("Account not found.");
                }
            } else if (choice == 4) {
                List<Account> allAccounts = bank.getAllAccounts();
                for (Account acc : allAccounts) {
                    System.out.println(acc.accountInfo());
                }
            } else if (choice == 5) {
                System.out.print("Enter the account number for the transaction: ");
                String accountNumber = scanner.nextLine();
                Account account = bank.getAccount(accountNumber);

                if (account != null) {
                    System.out.println("Choose which transaction to complete:");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.print("Choose a transaction (1/2): ");
                    int transactionChoice = scanner.nextInt();
                    scanner.nextLine(); 

                    if (transactionChoice == 1) {
                        System.out.print("Enter the amount to deposit: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); 
                        account.deposit(amount);
                        System.out.println("Deposit successful.");
                        System.out.println("Updated account details:");
                        System.out.println(account.accountInfo());
                    } else if (transactionChoice == 2) {
                        System.out.print("Enter the amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); 
                        boolean success = account.withdraw(amount);
                        if (success) {
                            System.out.println("Withdrawal successful.");
                            System.out.println("Updated account details:");
                            System.out.println(account.accountInfo());
                        } else {
                            System.out.println("Not enough money. Withdrawal failed.");
                        }
                    } else {
                        System.out.println("Invalid transaction choice. Please select 1 (Deposit) or 2 (Withdraw).");
                    }
                } else {
                    System.out.println("Account not found.");
                }
            } else if (choice == 6) {
                System.out.println("Thank you!");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid choice. Please select one of the available operations.");
            }

            System.out.println();
        }
    }
}