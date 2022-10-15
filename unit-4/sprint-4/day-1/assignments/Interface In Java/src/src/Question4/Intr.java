package Question4;
import java.util.Scanner;
public interface Intr {
    int[] display(int p);
}
class Test implements Intr{

    @Override
    public int[] display(int p) {
        for(int i=2;i<=p;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
        return new int[0];
    }
}
class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        Test t=new Test();
        int [] arr=t.display(n);
    }
}