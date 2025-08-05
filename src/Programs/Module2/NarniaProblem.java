package Programs.Module2;

import java.util.Scanner;

public class NarniaProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while(num!=0){
            sum += num % 10;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
