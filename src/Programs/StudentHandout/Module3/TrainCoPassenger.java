package Programs.StudentHandout.Module3;

import java.util.Scanner;

public class TrainCoPassenger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = (n-1)%8+1;
        int partner = 0;
        String type = "";

        switch(position){
            case 1:
                partner = n+3;
                type = "LB";
                break;
            case 2:
                partner = n+3;
                type = "MB";
                break;
            case 3:
                partner = n+3;
                type = "UB";
                break;

            case 4:
                partner = n-3;
                type = "LB";
                break;

            case 5:
                partner = n-3;
                type = "MB";
                break;

            case 6:
                partner = n-3;
                type = "UB";
                break;

            case 7:
                partner = n+1;
                type = "SU";
                break;

            case 8:
                partner = n-1;
                type = "SL";
                break;
        }

        System.out.println(partner + type);
    }
}
