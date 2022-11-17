package question3;

public class Even  extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=20;i++){
            if(i%2==0){
                System.out.println("This is Even Number:"+i);
            }
        }
    }
}
