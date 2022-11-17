package question4;

public class KohliThread  extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Kohli thread sum is:"+i);
        }

    }

}
