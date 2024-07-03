package jul2.bank;

public class Bank {


    double balance = 2000;

    // get balance

    double getBalance() {
        return balance;
    }

    // deposit

    double deposit(double depositAmount) {
        balance = balance + depositAmount;
        return balance;
    }


    // withdraw

    double withdraw(double withdrawAmount) throws InsufficientBalanceException {

        if(withdrawAmount > balance) {

            throw new InsufficientBalanceException("Insufficient Balance Exception ");
          // throw - you explicitly throw an exception

        }
        balance = balance - withdrawAmount;
        return balance;
    }
}
// throws