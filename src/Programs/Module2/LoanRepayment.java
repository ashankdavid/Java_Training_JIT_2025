package Programs.Module2;

import java.util.Scanner;

public class LoanRepayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;
        double total = principal + interest;
        double discount = interest * 0.02;
        double finalAmount = total - discount;

        System.out.println(interest);
        System.out.println(total);
        System.out.println(discount);
        System.out.println(finalAmount);
    }
}
