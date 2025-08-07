package Programs.StudentHandout.Module2;

import java.util.Scanner;

public class NewspaperAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int profit = (w * (x-y)) - 100;

        System.out.println(profit);
    }
}
