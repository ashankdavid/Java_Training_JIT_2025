package Strings;

public class StringBuilderExample {
    void stringAppend(){
        StringBuilder sb = new StringBuilder("JIT");
        sb.append("College");
        System.out.println("New String: " + sb);
    }
    void stringInsert(){
        StringBuilder sb = new StringBuilder("JA");
        System.out.println("Before Insertion: "+ sb);
        sb.insert(1, "AV");
        System.out.println("After Insertion: " + sb);
    }
    void stringReverse(){
        StringBuilder sb = new StringBuilder("JIT");
        System.out.println("Before Reversing: " + sb);
        sb.reverse();
        System.out.println("After Reversing: " + sb);
    }

    public static void main(String[] args) {
        StringBuilderExample sb = new StringBuilderExample();
        sb.stringAppend();
        sb.stringInsert();
        sb.stringReverse();
    }
}
