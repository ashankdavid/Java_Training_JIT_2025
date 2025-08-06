package OOPs.Polymorpism;

class India {
    void capital(){
        System.out.println("New Delhi");
    }
}

class USA{
    void capital(){
        System.out.println("Washington D.C");
    }
}

class DriverCode{
    public static void main(String[] args) {
        India objIND = new India();
        USA objUSA = new USA();

        objIND.capital();
        objUSA.capital();
    }
}
