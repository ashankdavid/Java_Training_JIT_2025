package Programs.StudentHandout.Module12;

import java.util.Scanner;

// custom exception for age
class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
}

// custom exception for name
class NameNotValidException extends Exception{
    public NameNotValidException(String message){
        super(message);
    }
}


public class Student {
    int rollNo;
    String name;
    int age;
    String course;

    Student(int rollNo, String name, int gae, String course) throws AgeNotWithinRangeException, NameNotValidException{
        this.rollNo = rollNo;
        // age validation
        if(age < 15 || age > 21){
            throw new AgeNotWithinRangeException("Age is not between 15 and 21");
        }
        this.age = age;
        // name validation
        if(name.matches("[a-zA-Z]+")){
            throw new NameNotValidException("Name is Not Valid!");
        }
        this.name = name;
        this.course = course;
    }

    public void display(){
        System.out.println(rollNo + " " + name + " " + age + " " + course);
    }
}

class Driver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollNo = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        String course = sc.next();

        try{
            Student s = new Student(rollNo, name, age, course);
            s.display();
        }catch (AgeNotWithinRangeException e){
            System.out.println(e.getMessage());
            System.out.println(rollNo + " " + name + " " + age + " " + course);
        }catch (NameNotValidException e){
            System.out.println(e.getMessage());
            System.out.println(rollNo + " " + name + " " + age + " " + course);
        }
    }
}
