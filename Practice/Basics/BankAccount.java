/* Create a class BankAccount that has Depositor name , Acc_no, Acc_type, 
Balance as Data Members and void createAcc() . void Deposit(), void withdraw() 
and void BalanceInquiry as Member Function. When a new Account is created 
assign next serial no as account number. Account number starts from 1 */

import java.util.Scanner;

class BankAccount {
    String DepositorName, AccountType;
    int AccountNumber, count = 0;
    float Balance;

    Scanner sc = new Scanner(System.in);

    void CreateAccount() {
        System.out.print("Enter name: ");
        DepositorName = sc.next();
        System.out.print("Enter account type: ");
        AccountType = sc.next();
        count++;
        AccountNumber = count;
        System.out.print("Enter initial balance to deposit: Rs. ");
        Balance = sc.nextFloat();
    }

    void Deposit() {
        float deposit;
        System.out.print("Enter amount to deposit: Rs. ");
        deposit = sc.nextFloat();
        Balance += deposit;
        System.out.println("Current balance: Rs. " + Balance);
    }

    void Withdraw() {
        float withdraw;
        System.out.print("Enter amount to withdraw: Rs. ");
        withdraw = sc.nextFloat();

        if (withdraw > Balance) {
            System.out.println("You don't have enough balance to withdraw Rs. " + withdraw);
        } else if (withdraw < Balance) {
            Balance -= withdraw;
            System.out.println("Current balance: Rs. " + Balance);
        }
    }

    void BalanceInquiry() {
        System.out.println("**************************");
        System.out.println("----CUSTOMER'S DETAILS----");
        System.out.println("Account holder: " + DepositorName);
        System.out.println("Account type: " + AccountType);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: Rs. " + Balance);
        System.out.println("**************************");
    }

    public static void main(String[] args) {
        BankAccount customer = new BankAccount();
        customer.CreateAccount();
        customer.Deposit();
        customer.Withdraw();
        customer.BalanceInquiry();
    }
}
