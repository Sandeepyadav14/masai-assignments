import java.util.Scanner;

public class EvenSumColumn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Rows value:");
        int n= s.nextInt();
        System.out.println("Enter the Column value:");
        int m=s.nextInt();
        int array[][]=new int[n][m];
        System.out.println("Enter the element of the array:");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                array[i][j]=s.nextInt();


        System.out.println("array is here:");

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if(array[j][i]%2==0){
                    sum=sum+array[j][i];
                }
            }
            System.out.println(sum);
        }

    }
}
