package OOPs.Inheritance.Hierarchial;

// Hierarchial Level Inheritance
class A {
    void add(){
        return;
    }
}

class B extends A {
    void sub(){
        return ;
    }
}

class C extends A {
    void Mul(){
        return ;
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
        objC.Mul();
    }
}
