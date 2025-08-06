package OOPs.Basics;

public class Car {
    private String brandName;
    private int manuDate;

    Car(String bName, int mDate){
        brandName = bName;
        manuDate = mDate;
    }

    public void printDetails(){
        System.out.println("Car name is: " + this.brandName);
        System.out.println("Car manuDate is " + this.manuDate);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 1999);
        Car c2 = new Car("Audi", 2005);
        c1.printDetails();
        c2.printDetails();
    }
}

class Driver{

}
