package April_3rd_CustomException;

public class ATM {
    private int currentBalance = 50000;
    private int pin = 1234;

    public void addBalance(int deposit, int pin) {
        if(this.pin==pin) {
            currentBalance += deposit;
            System.out.println("\nAdded amount: "+deposit);
        }
        else {
            throw new InvalidPinException("Invalid Pin entered");
        }
    }

    public void getBalance(int pin) {
        if(this.pin==pin) {
            System.out.println("\nCurrent Balance: "+currentBalance);
        }
        else {
            throw new InvalidPinException("Invalid Pin entered");
        }
    }

    public void withdraw(int withdraw, int pin) {
        if(this.pin == pin) {
            if (currentBalance >= withdraw) {
                currentBalance -= withdraw;
                System.out.println("\nWithdrawal amount: "+withdraw);
            }
            else {
                throw new InsufficientBalanceException("Insufficient Balance");
            }
        }
        else {
            throw new InvalidPinException("Invalid Pin entered");
        }
    }
}
