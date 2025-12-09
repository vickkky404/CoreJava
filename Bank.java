// Bank.java - Method Overloading Example
public class Bank {
    // Method overloading - deposit method
    public void deposit(double amount) {
        System.out.println("Deposited: " + amount);
    }

    public void deposit(int amount, String type) {
        System.out.println("Deposited: " + amount + " (" + type + ")");
    }

    // Overloading withdraw
    public void withdraw(double amount) {
        System.out.println("Withdrawn: " + amount);
    }

    public void withdraw(double amount, String reason) {
        System.out.println("Withdrawn: " + amount + " for " + reason);
    }

    // Overloading transfer
    public void transfer(double amount) {
        System.out.println("Transferred: " + amount);
    }

    public void transfer(double amount, String accountNumber) {
        System.out.println("Transferred: " + amount + " to account " + accountNumber);
    }

    public void transfer(double amount, String accountNumber, String message) {
        System.out.println("Transferred: " + amount + " to " + accountNumber);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(5000);
        bank.deposit(10000, "Check");
        bank.withdraw(1000);
        bank.withdraw(500, "ATM Withdrawal");
        bank.transfer(2000);
        bank.transfer(3000, "ACC12345");
        bank.transfer(5000, "ACC67890", "Payment for goods");
    }
}
