package Day10_22nd_March_Encapsulation;

public class NetBank {
    private int currentBalance = 50000;
    private int pin = 1234;

    public void addBalance(int deposit, int pin) {
        if(this.pin==pin) {
            currentBalance += deposit;
            System.out.println("\nAdded amount: "+deposit);
        }
        else {
            System.out.println("Invalid Pin!!");
        }
    }

    public void getBalance(int pin) {
        if(this.pin==pin) {
            System.out.println("\nCurrent Balance: "+currentBalance);
        }
        else {
            System.out.println("Invalid Pin!!");
        }
    }

    public void withdraw(int withdraw, int pin) {
        if(this.pin == pin) {
            if (currentBalance >= withdraw) {
                currentBalance -= withdraw;
                System.out.println("\nWithdrawal amount: "+withdraw);
            } else {
                System.out.println("Not enough amount!!");
            }
        }
        else {
            System.out.println("Invalid Pin!!");
        }
    }
}
