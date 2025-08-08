package Strings;

public class StringsInJava {
    public static void main(String[] args) {
        String message = "Hello";
        char[] chars = {'H','E','L','L','O'};
        String newString = new String(chars);
        System.out.println(message);
        System.out.println(newString);

        // Accessing the Elements:
        System.out.println(message.charAt(0));
        System.out.println(message.charAt(message.length()-1));

        // Length
        System.out.println(message.length());

        String m1 = "JIT";
        String m2 = "College";
        String m3 = "10";
        String m4 = "20";

        System.out.println(m1 + " " + m2);
        System.out.println(m3+m4);

        String lcaps = "abcd";
        System.out.println(lcaps.toUpperCase());

        String name = "         Ashank      ";
        System.out.println(name.trim());


        // Strings are Immutable
        String name1 = "Ashank";
        String city = new String("Bangalore");

        System.out.println(name1);
        System.out.println(name1.concat(city));
        System.out.println(name1);
    }
}
