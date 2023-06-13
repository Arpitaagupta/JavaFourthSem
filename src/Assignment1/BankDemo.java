package Assignment1;

interface Bank {
    public void deposit(int accountNumber, int amount);
    public void withdraw(int accountNumber, int amount);
    public int getBalance(int accountNumber);
}

class BankDatabase implements Bank {
    private int[] balances;

    public BankDatabase(int numAccounts) {
        balances = new int[numAccounts];
    }

    public void deposit(int accountNumber, int amount) {
        balances[accountNumber] += amount;
    }

    public void withdraw(int accountNumber, int amount) {
        balances[accountNumber] -= amount;
    }

    public int getBalance(int accountNumber) {
        return balances[accountNumber];
    }
}

public class BankDemo {
    public static void main(String[] args) {
        // Create a bank database with 5 accounts
        Bank bank = new BankDatabase(5);

        // Deposit some money into account 0
        bank.deposit(0, 100);

        // Withdraw some money from account 0
        bank.withdraw(0, 50);

        // Get the balance of account 0
        int balance = bank.getBalance(0);

        // Print the balance of account 0
        System.out.println("Balance of account 0: " + balance);

        // Deposit some money into account 1
        bank.deposit(1, 2500);

        // Get the balance of account 1
        balance = bank.getBalance(1);

        // Print the balance of account 1
        System.out.println("Balance of account 1: " + balance);

        // Withdraw more money than is available from account 2
        bank.withdraw(2, 150);

        // Get the balance of account 2
        balance = bank.getBalance(2);

        // Print the balance of account 2
        System.out.println("Balance of account 2: " + balance);
    }
}
