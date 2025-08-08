package ExceptionHandling;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomExceptionExample {

    static void ageChecker(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Access Denied! - Age is less than 18!");
        }else{
            System.out.println("Access Granted! - You are Eligible!");
        }
    }

    public static void main(String[] args) {
        try{
            ageChecker(15);
        }catch (InvalidAgeException e){
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
