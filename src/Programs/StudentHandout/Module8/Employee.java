package Programs.StudentHandout.Module8;

public class Employee {
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    double calcuBonus(){
        return salary * 0.10;
    }
}

class Manager extends Employee{
    public Manager(double salary) {
        super(salary);
    }

    @Override
    double calcuBonus() {
        return salary * 0.15;
    }
}

class DriverCode{
    public static void main(String[] args) {
        String Role = "Manager";
        int salary = 70000;

        Employee emp;

        if(Role.equals("Employee")){
            emp = new Employee(salary);
        }else{
            emp = new Manager(salary);
        }

        System.out.println("Bonus: " + emp.calcuBonus());
    }
}
