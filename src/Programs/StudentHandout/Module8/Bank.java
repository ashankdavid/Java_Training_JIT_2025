package Programs.StudentHandout.Module8;

public class Bank {
    double getInterestRate(String accountType, double amount){
        switch(accountType){
            case "Savings":
                return amount * 0.04;
            case "FixedDeposit":
                return amount * 0.06;
            case "RecurringDeposit":
                return amount * 0.05;
            default:
                return 0.0;
        }
    }

    double getInterestRate(int accountNo, double amount){
        switch (accountNo) {
            case 1:
                return amount * 0.04;
            case 2:
                return amount * 0.06;
            case 3:
                return amount * 0.05;
            default:
                return 0.0;

        }
    }

    double getInterestRate(double fixedAmount, double amount){
        return fixedAmount * amount / 100;
    }
}

class Driver{
    public static void main(String[] args) {
        Bank b = new Bank();
        String accountType = "Savings";
        double amount = 10000;

        double interest = b.getInterestRate(accountType, amount);
        System.out.println("Interest: " + interest);
    }
}
