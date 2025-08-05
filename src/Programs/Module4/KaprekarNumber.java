package Programs.Module4;

import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        boolean found = false;
        String sqStr = Integer.toString(sq);

        for(int i=1; i<sqStr.length(); i++){
            String leftStr = sqStr.substring(0,i);
            String rightStr = sqStr.substring(i);

            int left = Integer.parseInt(leftStr);
            int right = Integer.parseInt(rightStr);

            if(right!=0 && left + right == n){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Yess");
        }else{
            System.out.println("No");
        }
    }
}
