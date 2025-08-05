package Programs.Module2;

import java.util.Scanner;

public class CricketStadium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        int perimeter = 2*(length + breadth);
        int area = length * breadth;

        System.out.println(perimeter);
        System.out.println(area);
    }
}
