package question7;

public class Main {
    public static void main(String[] args) {
        ThreadA ta=new ThreadA();
        ThreadB tb=new ThreadB();
         Main m=new Main();
        Thread t1=new Thread(ta);
        Thread t2=new Thread(tb);

        t1.setName("Kohli Thread");
        t2.setName("Dhoni Thread");
        t1.setPriority(8);
        t2.setPriority(10);
        t1.start();
        t2.start();

    }
}
