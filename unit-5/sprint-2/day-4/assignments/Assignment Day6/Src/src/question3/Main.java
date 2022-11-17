package question3;

public class Main {
    public static void main(String[] args) {
        Odd o=new Odd();
        Even e=new Even();

        Thread t=new Thread(o);
        Thread t1=new Thread(e);
        t.start();
        t1.start();
    }
}
