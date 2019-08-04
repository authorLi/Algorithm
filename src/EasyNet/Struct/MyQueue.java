package EasyNet.Struct;

/**
 * @author mycclee
 * @createTime 2019/7/29 10:44
 */
public class MyQueue {

    private int[] elements;

    private int[] newElemets;

    private int newLength;

    public MyQueue() {
        elements = new int[0];
    }

    public void push(int element) {
        newLength = elements.length + 1;
        newElemets = new int[newLength];
        for (int i = 0; i < elements.length; i++) {
            newElemets[i] = elements[i];
        }
        newElemets[elements.length] = element;
        elements = newElemets;
    }

    public int pop() {
        int res = -1;
        if (elements.length == 0) {
            System.out.print("现在队列是空的！错误码：");
        } else {
            newLength = elements.length - 1;
            newElemets = new int[newLength];
            for (int i = 0; i < newLength; i++) {
                newElemets[i] = elements[i + 1];
            }
            res = elements[0];
            elements = newElemets;
        }
        return res;
    }

    public int size() {
        return elements.length;
    }

    public boolean isEmpty() {
        return size() == 0 ? true : false;
    }
}
