package Basics;

public class Hello {
    void printHello(){
        System.out.println("hello");
    }
}

class Demo{
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.printHello();
    }
}
