package Question2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws DivideByZeroException {
        Scanner s=new Scanner(System.in);
        System.out.println("PLease Enter First Number:");
        int number1=s.nextInt();
        System.out.println("Please Enter Second Number");
        int number2=s.nextInt();
        try{
            System.out.println(number1/number2);
        }catch(Exception e){
            throw new DivideByZeroException("Caught");

        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
