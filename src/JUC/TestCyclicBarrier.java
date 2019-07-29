package JUC;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {
    public static void main(String[] args){
        int N = 4;
        CyclicBarrier barrier = new CyclicBarrier(N);
        for(int i = 0;i < N;i++){
            new Writer(barrier).start();
        }
    }

    static class Writer extends Thread{
        private CyclicBarrier barrier;

        public Writer(CyclicBarrier barrier){
            this.barrier = barrier;
        }

        @Override
        public void run(){
            System.out.println("线程" + Thread.currentThread().getName() + "正在写入数据");
            try{
                Thread.sleep(500);
                System.out.println("线程" + Thread.currentThread().getName() + "写入数据完毕");
                barrier.await();
            }catch (InterruptedException e){
                e.printStackTrace();
            }catch (BrokenBarrierException e){
                e.printStackTrace();
            }
            System.out.println("所有线程写入完毕,继续处理其他任务");
        }
    }

}
