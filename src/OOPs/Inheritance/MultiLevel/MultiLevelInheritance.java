package OOPs.Inheritance.MultiLevel;

// MultiLevel Inheritance
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

class C extends B{
    void mul(){
        return;
    }
}

class DriverCode{
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.add();

        objB.add();
        objB.sub();

        objC.add();
        objC.sub();
        objC.mul();
    }
}
