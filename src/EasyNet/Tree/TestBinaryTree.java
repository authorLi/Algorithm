package EasyNet.Tree;

/**
 * @author mycclee
 * @createTime 2019/8/5 9:28
 */

/**
 * 测试树
 */
public class TestBinaryTree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        tree.setRoot(root);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode l2 = new TreeNode(4);
        TreeNode r2 = new TreeNode(5);
        TreeNode l3 = new TreeNode(6);
        TreeNode r3 = new TreeNode(7);
        root.setLeft(l1);
        root.setRight(r1);
        l1.setLeft(l2);
        l1.setRight(r2);
        r1.setLeft(l3);
        r1.setRight(r3);
        root.frontShow();
        root.middleShow();
        root.afterShow();
        TreeNode result = tree.frontSearch(8);
        System.out.println(result);
        tree.delete(1);
        tree.frontShow();
    }
}
