package OOPs.Polymorpism;

class Mom {
    void cook(){
        System.out.println("Indian");
    }
}

class Daughter extends Mom{
    void cook(){
        System.out.println("Chinese");
    }
}

class DriverCode2{
    public static void main(String[] args) {
        Mom m = new Mom();
        Daughter d = new Daughter();

        m.cook();
        d.cook();
    }
}
