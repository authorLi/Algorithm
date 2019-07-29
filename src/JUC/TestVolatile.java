package JUC;

public class TestVolatile {

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo();
        new Thread(demo).start();

        while (true) {
            if (demo.isFlag()) {
                System.out.println("#########");
                break;

            }
        }
    }
}

class ThreadDemo implements Runnable {

    private boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }

        flag = true;
        System.out.println("flag = " + isFlag());
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}