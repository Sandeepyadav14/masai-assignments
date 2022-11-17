package question7;

public class ThreadB extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            String s=Thread.currentThread().getName();
            System.out.println(s);
        }
    }
}
