package EasyNet;

/**
 * @author mycclee
 * @createTime 2019/7/29 10:58
 */
public class Node {

    private int val;

    private Node next;

    public Node(int val) {
        this.val = val;
    }

    //尾插法:每次都插入到尾部
    public void append(Node node) {
        Node cur = this;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public Node next() {
        return this.next;
    }

    public int getVal() {
        return this.val;
    }

    public boolean isLast() {
        return this.next == null ? true : false;
    }

    public void removeNext(){
        this.next = this.next.next;
    }

    public void show(){
        Node cur = this;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(Node node){
        node.next = this.next;
        this.next = node;
    }
}
