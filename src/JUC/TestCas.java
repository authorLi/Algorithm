package JUC;

/**
 * @author mycclee
 * @createTime 2019/8/2 16:41
 */
public class TestCas {

    public static void main(String[] args) {

        final CompareAndValue cas = new CompareAndValue();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int except = cas.get();
                    boolean b = cas.compareAndSet(except, (int) Math.random() * 101);
                    System.out.println(b);
                }
            }).start();
        }
    }


}

class CompareAndValue {

    private int value;

    public synchronized int get() {
        return value;
    }

    public synchronized int compareAndSwap(int except, int newValue) {
        int oldValue = value;

        if (oldValue == except) {
            this.value = newValue;
        }

        return oldValue;
    }

    public synchronized boolean compareAndSet(int except, int newValue) {
        return except == compareAndSwap(except, newValue);
    }
}
