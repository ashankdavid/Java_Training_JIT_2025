package OOPs.Encapsulation;

public class Student {
    private String name;
    private int usn;

    public Student(String name, int usn) {
        this.name = name;
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsn() {
        return usn;
    }

    public void setUsn(int usn) {
        this.usn = usn;
    }
}

class DriverCOde{
    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 123);
        s1.setName("David");
        System.out.println(s1.getName());
    }
}
