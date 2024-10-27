class Dailysavings extends BankAccount {
    public Dailysavings(String accountID, String iban) {
        super(accountID, iban, "Daily Savings");
        this.balance = 100000;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + "€ successful.\nNew balance: " + balance+ "€ \n");
        } else {
            System.out.println("Invalid amount or insufficient funds."+ "\n"+ "\n");
        }
    }
}