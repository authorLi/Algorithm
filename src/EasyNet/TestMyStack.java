package EasyNet;

/**
 * @author mycclee
 * @createTime 2019/7/29 10:33
 */
public class TestMyStack {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
