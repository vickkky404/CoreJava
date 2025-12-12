// OOPS Program 4: Encapsulation
public class OOPS_04_Encapsulation {
    static class BankAccount {
        private double balance;
        public BankAccount(double initial) { this.balance = initial; }
        public void deposit(double amount) { if(amount > 0) balance += amount; }
        public void withdraw(double amount) { if(amount > 0 && amount <= balance) balance -= amount; }
        public double getBalance() { return balance; }
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Balance: " + acc.getBalance());
    }
}
