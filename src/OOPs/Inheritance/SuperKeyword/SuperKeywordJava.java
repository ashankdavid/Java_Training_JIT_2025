package OOPs.Inheritance.SuperKeyword;

class Person {
    String fname;
    String lname;

    Person(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
}

class Student extends Person{
    int usn;

    Student(String fname, String lname, int usn){
        super(fname, lname);
        /*
        this.fname = fname;
        this.lname = lname;
         */
        this.usn = usn;
    }
}

class Drivercode{
    public static void main(String[] args) {
        Student s1 = new Student("abhishek", "asdas", 123);
    }
}