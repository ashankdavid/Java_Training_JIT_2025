package Programs.StudentHandout.Module7;

import java.util.Scanner;

public class Account {
    int accountID;
    String holderName;
    double balance;

    public Account(int accID, String name, double bal) {
        if(accID < 100 || accID > 999){
            this.accountID = -1;
        }else{
            this.accountID = accID;
        }
        if(bal < 0){
            this.balance = 0;
        }else{
            this.balance = bal;
        }
        this.holderName = name;
    }

    void setAccountBalance(double bal){
        if(bal >= 0){
            balance = bal;
        }else{
            balance = 0;
        }
        System.out.println(balance);
    }

    double credit(double amt){
        balance += amt;
        return balance;
    }
}

class VIPAccount extends Account{
    public VIPAccount(int accID, String name, double bal) {
        super(accID, name, bal);
    }

    @Override
    void setAccountBalance(double bal) {
        if(bal >= -10000){
            balance = bal;
        }else{
            balance = -10000;
        }
        System.out.println("The balance can be negative but no less than -10000");
    }
}

class Driver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        double bal = sc.nextDouble();
        double credtAmt = sc.nextDouble();
        double negBal = sc.nextInt();

        Account acct = new Account(id, name, bal);
        System.out.println(acct.accountID + " " + acct.holderName + " " + acct.balance);

        double newBal = acct.credit(credtAmt);
        System.out.println(newBal);

        acct.setAccountBalance(newBal);

        VIPAccount vipAcct = new VIPAccount(id, name, newBal);
        vipAcct.setAccountBalance(negBal);
    }
}
