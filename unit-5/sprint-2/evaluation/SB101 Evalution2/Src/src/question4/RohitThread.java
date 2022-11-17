package question4;

public class RohitThread extends Thread {
    @Override
    public void run() {
        long sum=1;
      for(int i=1;i<=10;i++){
          sum=sum*i;
      }
        System.out.println("Rohit product is "+sum);
    }

}
