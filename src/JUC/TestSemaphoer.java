package JUC;

import java.util.concurrent.Semaphore;

public class TestSemaphoer {

    public static void main(String[] args) {
        int N = 8;//工人数
        Semaphore semaphore = new Semaphore(5);//机器数
        for (int i = 0; i < N; i++) {
            new Worker(i + 1,semaphore).start();
        }
    }

    static class Worker extends Thread {

        private int num;
        private Semaphore semaphore;

        public Worker(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("工人" + this.num + "占用一台机器在生产...");
                Thread.sleep(2000);
                System.out.println("工人" + this.num + "释放出一台机器");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
