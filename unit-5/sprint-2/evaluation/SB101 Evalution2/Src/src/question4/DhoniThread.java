package question4;

public class DhoniThread extends Thread{
    @Override
    public void run() {
        int sum=0;
    for(int i=0;i<=20;i++){
      sum=sum+i;
    }
        System.out.println("Dhoni Thread sum is:"+sum);
    }


}
