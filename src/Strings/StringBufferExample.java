package Strings;

public class StringBufferExample {
    void stringAppend(){
        StringBuffer sb = new StringBuffer("JIT");
        sb.append("College");
        System.out.println("New String: " + sb);
    }
    void stringInsert(){
        StringBuffer sb = new StringBuffer("JA");
        System.out.println("Before Insertion: "+ sb);
        sb.insert(1, "AV");
        System.out.println("After Insertion: " + sb);
    }
    void stringReverse(){
        StringBuffer sb = new StringBuffer("JIT");
        System.out.println("Before Reversing: " + sb);
        sb.reverse();
        System.out.println("After Reversing: " + sb);
    }

    public static void main(String[] args) {
        StringBufferExample sb = new StringBufferExample();
        sb.stringAppend();
        sb.stringInsert();
        sb.stringReverse();
    }
}

