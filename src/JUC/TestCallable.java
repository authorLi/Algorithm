package JUC;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author mycclee
 * @createTime 2019/8/2 17:10
 */
public class TestCallable {

    public static void main(String[] args) {
        ThreadCallable tc = new ThreadCallable();
        FutureTask<Integer> task = new FutureTask(tc);
        new Thread(task).start();
        try {
            Integer i = task.get();
            System.out.println(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class ThreadCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 0;i <= 100;i++){
            sum += i;
        }
        return sum;
    }
}