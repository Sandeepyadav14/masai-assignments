package question4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main m=new Main();
        DhoniThread d=new DhoniThread();
        RohitThread r=new RohitThread();
        KohliThread k=new KohliThread();
        d.setPriority(10);
        r.setPriority(9);
        k.setPriority(5);

        d.start();
        d.join();
        r.start();
        r.join();
        k.start();
    }
}
