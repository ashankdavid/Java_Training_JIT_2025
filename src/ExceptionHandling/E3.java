package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try{
            String name;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Data: ");
            name = br.readLine();
            System.out.println(name);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            br.close();
        }
    }
}
