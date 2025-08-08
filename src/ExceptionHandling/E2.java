package ExceptionHandling;

public class E2 {
    static void ageChecker(int age){
        if(age < 18){
            throw new RuntimeException("Access Denied! - Age is less than 18!");
        }else{
            System.out.println("Access Granted! - You are Eligible!");
        }
    }

    public static void main(String[] args) {
        ageChecker(15);
    }
}
