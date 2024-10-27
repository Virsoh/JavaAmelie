public class BankApp {
    public static void main(String[] args) {
        User user = new User("1234", "amelie@gmail.com", "Hofbauer", "Amelie");

        Dailysavings dailySavings = new Dailysavings("DS001", "DE1234567890");
        CurrentAccount currentAccount = new CurrentAccount("CA001", "DE0987654321", "1234567890123456");

        System.out.println("User data: \n" + user);

       /* dailySavings.deposit(10000);
        System.out.println("Daily Savings Kontostand: " + dailySavings.getBalance()+ "€ \n"); */

        System.out.println("Current Account balance: " + currentAccount.balance + "€");



        currentAccount.deposit(500);
        System.out.println("New Current Account balance: " + currentAccount.getBalance()+ "€ \n");

        //currentAccount.withdraw(50);
        System.out.println("Daily Savings account balance: "+ dailySavings.balance +"€");
        dailySavings.withdraw(10000);

        System.out.println("Thank you for your visit!" + "\nPlease come again!");
    }
}
