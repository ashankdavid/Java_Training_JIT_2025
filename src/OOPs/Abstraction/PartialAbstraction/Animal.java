package OOPs.Abstraction.PartialAbstraction;

abstract class Animal {
    abstract void eat();

    void run(){

    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("Fish");
    }
}
