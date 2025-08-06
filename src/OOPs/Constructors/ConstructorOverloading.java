package OOPs.Constructors;

import org.w3c.dom.ls.LSOutput;

class ConstructorDemo {
    int x;
    int y;

    ConstructorDemo(){
        x = 10;
        y = 20;
    }

    ConstructorDemo(int a, int b){
        x = a;
        y = b;
    }

    ConstructorDemo(double a, double b){
        x = (int) a;
        y = (int) b;
    }
}

class DriverCode{
    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo();
        System.out.println(obj1.x);
        System.out.println(obj1.y);

        ConstructorDemo obj2 = new ConstructorDemo(20,30);
        System.out.println(obj2.x);
        System.out.println(obj2.y);

        ConstructorDemo obj3 = new ConstructorDemo(1.2,3.5);
        System.out.println(obj3.x);
        System.out.println(obj3.y);
    }
}
