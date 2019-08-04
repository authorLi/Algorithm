package EasyNet.Struct;

/**
 * @author mycclee
 * @createTime 2019/7/29 10:52
 */
public class TestMyQueue {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        System.out.println(queue.isEmpty());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        System.out.println(queue.pop());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}
