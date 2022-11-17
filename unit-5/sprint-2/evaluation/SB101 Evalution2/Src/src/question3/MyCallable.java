package question3;
import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    int num;

    public MyCallable(int n) {
        this.num = n;
    }

    @Override
    public Object call() throws Exception {
        long product = 1;

        for (int i = 1; i <= num; i++) {
            product *= i;
        }

        return Thread.currentThread().getName()+ ": " +product;
    }
}