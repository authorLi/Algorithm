package EasyNet;

/**
 * @author mycclee
 * @createTime 2019/7/29 18:10
 */
public class TestLoopNode {

    public static void main(String[] args) {
        LoopNode node1 = new LoopNode(1);
        LoopNode node2 = new LoopNode(2);
        LoopNode node3 = new LoopNode(3);
        LoopNode node4 = new LoopNode(4);
        LoopNode node5 = new LoopNode(5);

        node1.after(node2);
        node2.after(node3);
        node3.after(node4);
        node4.after(node5);
        System.out.println(node1.next().getVal());
        System.out.println(node2.next().getVal());
        System.out.println(node3.next().getVal());
        System.out.println(node4.next().getVal());
        System.out.println(node5.next().getVal());
    }
}
