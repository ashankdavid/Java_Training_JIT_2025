package ExceptionHandling;

public class E1 {
    public static void main(String[] args) {
        int i, j, k=0;
        try{
            i = 10;
            j = 2;
            k = i / j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            System.out.println("You cannot Divide by Zero!");
            e.printStackTrace();
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("You are accessing the wrong index!");
//        }
        catch (Exception e){
            System.out.println("Some Technical Issue Came!!");
        }finally {
            System.out.println("Exiting...");
        }

    }
}
