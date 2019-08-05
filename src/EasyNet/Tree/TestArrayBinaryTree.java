package EasyNet.Tree;

/**
 * @author mycclee
 * @createTime 2019/8/5 10:39
 */

/**
 * 测试顺序存储二叉树
 */
public class TestArrayBinaryTree {

    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5,6,7};
        ArrayBinaryTree tree = new ArrayBinaryTree(data);
        tree.frontShow();
    }
}
