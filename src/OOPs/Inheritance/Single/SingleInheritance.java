package OOPs.Inheritance.Single;

// Single Level Inheritance
class A {
    void add(){
        return;
    }
}

class B extends A{
    void sub(){
        return ;
    }
}

class DriverCode{
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.add();

        objB.add();
        objB.sub();
    }
}
