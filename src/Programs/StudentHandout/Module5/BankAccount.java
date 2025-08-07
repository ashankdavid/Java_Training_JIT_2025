package Programs.StudentHandout.Module5;

import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        balance += amt;
    }

    public void withdraw(double amt){
        balance -= amt;
    }
}

class DriverClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double balance = sc.nextDouble();
        double amt = sc.nextDouble();
        String operation = sc.next();

        BankAccount ba = new BankAccount(name, balance);

        if(operation.equals("deposit")){
            ba.deposit(amt);
        }else if (operation.equals("withdraw")){
            ba.withdraw(amt);
        }

        System.out.println("Account Holder: " + ba.getAccountHolderName());
        System.out.println("Updated Balance: " + ba.getBalance());

    }
}
