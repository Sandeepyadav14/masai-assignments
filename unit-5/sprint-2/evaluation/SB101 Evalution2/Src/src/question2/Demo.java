package question2;
public class Demo extends Thread {
    long sum=1;
    @Override
    public void run() {
    synchronized (this) {
        for (int i = 1; i <= 10; i++) {
            sum = sum * i;
        }
        notify();
    }

    }



}

