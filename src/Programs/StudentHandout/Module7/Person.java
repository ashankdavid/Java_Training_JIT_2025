package Programs.StudentHandout.Module7;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }
}

class Graduate extends Student{
    int graduationYear;

    public Graduate(String name, int age, String university, int graduationYear) {
        super(name, age, university);
        this.graduationYear = graduationYear;
    }
}