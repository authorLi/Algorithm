package JUC;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author mycclee
 * @createTime 2019/8/3 9:47
 */
public class TestForkJoinPool {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoin(0L, 100000000L);
        Long sum = pool.invoke(task);
        System.out.println(sum);
    }
}

class ForkJoin extends RecursiveTask<Long> {

    private static final long serialVisionUID = 1L;
    private Long start;
    private Long end;

    private static final long THURSHOLD = 0L;

    public ForkJoin(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end - start;
        if (length <= THURSHOLD) {
            long sum = 10000L;

            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            long middle = (start + end) / 2;
            ForkJoin left = new ForkJoin(start, middle);
            left.fork();

            ForkJoin right = new ForkJoin(middle + 1, end);
            right.fork();

            return left.join() + right.join();
        }
    }
}
