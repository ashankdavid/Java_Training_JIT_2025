package OOPs.Abstraction.FullAbstraction.MultipleInheritance;

interface Mom {
    void function();
}

interface Dad{
    void function();
}

class Child implements Mom, Dad{
    public void function(){

    }
}
