class NotEnoughMoney extends Exception {
    private int detail;

    NotEnoughMoney(int a) {
        detail = a;
    }

    public String toString() {
        return "NotEnoughMoney [" + detail + " ]";
    }
}

public class Bank {
    int OldBalance = 1000;

    void Deposit(int deposit) {
        System.out.println("Old balance: Rs. " + OldBalance);
        System.out.println("Amount deposited: Rs. " + deposit);
        OldBalance += deposit;
        System.out.println("New balance: Rs. " + OldBalance);
    }

    void Withdraw(int withdraw) {
        if (withdraw > OldBalance) {
            throw new ArithmeticException();
        } else if (withdraw < OldBalance) {
            System.out.println("Old balance: Rs. " + OldBalance);
            System.out.println("Withdrawl amount: Rs. " + withdraw);
            OldBalance -= withdraw;
            System.out.println("New balance: Rs. " + OldBalance);
            try {
                if (OldBalance < 500) {
                    throw new NotEnoughMoney(500);
                }
            } catch (NotEnoughMoney e) {
                System.out.println("Alert! Now your balance is less than Rs. 500");
            }
        }
    }

    public static void main(String[] args) {
        Bank customer = new Bank();
        try {
            customer.Deposit(1000);
            customer.Withdraw(1600);
            customer.Deposit(5000);
            customer.Withdraw(5500);
        } catch (ArithmeticException e) {
            System.out.println("You don't have enough balance to withdraw.");
        }
    }
}