package EasyNet;

/**
 * @author mycclee
 * @createTime 2019/7/29 18:23
 */
public class TestDoubleNode {

    public static void main(String[] args) {
        DoubleNode node1 = new DoubleNode(1);
        DoubleNode node2 = new DoubleNode(2);
        DoubleNode node3 = new DoubleNode(3);

        node1.after(node2);
        node2.after(node3);

        System.out.println(node1.getVal());
        System.out.println(node1.pre().getVal());
        System.out.println(node1.next().getVal());
        System.out.println(node2.getVal());
        System.out.println(node2.pre().getVal());
        System.out.println(node2.next().getVal());
        System.out.println(node3.getVal());
        System.out.println(node3.pre().getVal());
        System.out.println(node3.next().getVal());

    }
}
