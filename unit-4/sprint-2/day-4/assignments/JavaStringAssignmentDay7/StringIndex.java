import java.util.Scanner;

public class StringIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Enter the String: ");
       String s1= s.nextLine();
       System.out.println("Enter the character position you want to access: ");
       int n=s.nextInt();
       char c=s1.charAt(n);
       System.out.println(c);

    }
}
