package JUC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author mycclee
 * @createTime 2019/8/2 17:19
 */
public class TestLock {

    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t, "一号窗口").start();
        new Thread(t, "二号窗口").start();
        new Thread(t, "三号窗口").start();
    }
}

class Ticket implements Runnable {

    private int ticket = 100;

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":完成售票，剩余" + (--ticket) + "张票");
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}