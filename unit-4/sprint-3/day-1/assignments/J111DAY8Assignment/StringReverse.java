import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String ");
        String name=s.nextLine();
        String bag="";
        for(int i=name.length()-1;i>=0;i--){
            bag=bag+name.charAt(i);
        }
        System.out.println("this is the real string: "+name);
       System.out.println("this is the reverse string: "+bag);
    }
}
