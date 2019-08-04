package EasyNet.Struct;

/**
 * @author mycclee
 * @createTime 2019/7/29 11:08
 */
public class TestNode {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
//        node1.append(node2);
//        node2.append(node3);
//        node3.append(node4);
//        node4.append(node5);
//        node5.append(node6);
        node1.append(node2);
        node1.append(node3);
        node1.append(node4);
        node1.append(node5);
        node1.append(node6);
        node1.show();
    }
}
