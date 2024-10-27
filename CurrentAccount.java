class CurrentAccount extends BankAccount {
    private String cardNumber;

    public CurrentAccount(String accountID, String iban, String cardNumber) {
        super(accountID, iban, "Current Account");
        this.cardNumber = cardNumber;
        this.balance = 1000;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + "€ successful. New balance: " + balance+ "€ \n");
        } else {
            System.out.println("Invalid amount or insufficient funds."+ "\n"+ "\n");
        }
    }
}