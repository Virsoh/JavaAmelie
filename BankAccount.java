// Abstrakte BankAccount-Klasse
abstract class BankAccount {
    protected double balance;
    protected String accountID;
    protected String iban;
    protected String accountType;

    public BankAccount(String accountID, String iban, String accountType) {
        this.accountID = accountID;
        this.iban = iban;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credit of " + amount + "€ successful.");
        } else {
            System.out.println("Amount has to be positive." + "\n");
        }
    }

    public abstract void withdraw(double amount);
}
