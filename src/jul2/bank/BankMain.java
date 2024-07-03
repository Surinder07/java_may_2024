package jul2.bank;

public class BankMain {
    public static void main(String[] args) {

        try {
            calculateBalance();
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }

        System.out.println("something.... ");

    }


    public static void calculateBalance() throws InsufficientBalanceException{

        Bank bank = new Bank();

        // Balance
        double balance = bank.getBalance();
        System.out.println("Current balance  " + balance);


        // deposit
        double newBalance = bank.deposit(1000);
        System.out.println("New Balance in the account " + newBalance); // 3000

        // withdraw

        double balanceAfterWithdraw = bank.withdraw(4000);
        System.out.println("balance after 1000 withdraw " + balanceAfterWithdraw);

        System.out.println("Test after line 21");

    }
}
