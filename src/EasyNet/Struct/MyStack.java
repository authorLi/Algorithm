package EasyNet.Struct;

import java.util.Arrays;

/**
 * @author mycclee
 * @createTime 2019/7/29 10:24
 */
public class MyStack {

    private int[] elements;

    private int[] newElements;

    private int newLength;

    public MyStack() {
        elements = new int[0];
    }

    public void push(int element) {
        newLength = elements.length + 1;
        newElements = new int[newLength];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = element;
        elements = newElements;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("现在栈是空的！");
        }
        newLength = elements.length - 1;
        newElements = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newElements[i] = elements[i];
        }
        int res = elements[newLength];
        elements = newElements;
        return res;
    }

    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    public int peek() {
        if (isEmpty()){
            throw new RuntimeException("现在栈是空的！");
        }
        return elements[elements.length - 1];
    }

    public boolean isEmpty() {
        return elements.length == 0 ? true : false;
    }
}
