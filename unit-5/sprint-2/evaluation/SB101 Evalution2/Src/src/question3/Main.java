package question3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallable[] jobs = {
                new MyCallable(4),
                new MyCallable(10),
                new MyCallable(2),
                new MyCallable(6),
                new MyCallable(5),
                new MyCallable(8)
        };

        ExecutorService service = Executors.newFixedThreadPool(6);

        for (MyCallable job: jobs) {
            Future out = service.submit(job);

            System.out.println(out.get());
        }

        service.shutdown();
    }
}