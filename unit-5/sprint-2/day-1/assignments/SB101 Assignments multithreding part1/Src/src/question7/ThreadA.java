package question7;

public class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            String s1=Thread.currentThread().getName();
            System.out.println(s1);
        }
    }
}
