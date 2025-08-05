package Programs.Module1;

import java.util.Scanner;

public class AsciiConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println(num1 + "-" + (char) num1);
    }
}
