package EasyNet.Tree;

/**
 * @author mycclee
 * @createTime 2019/8/5 9:30
 */

/**
 * 树的节点
 */
public class TreeNode {

    //节点的权
    private int value;

    private TreeNode left;

    private TreeNode right;

    public TreeNode(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void setLeft(TreeNode node){
        this.left = node;
    }

    public void setRight(TreeNode node){
        this.right = node;
    }

    /**
     * 前序遍历
     */
    public void frontShow(){
        System.out.println(value);
        if (left != null){
            left.frontShow();
        }
        if (right != null){
            right.frontShow();
        }
    }

    /**
     * 中序遍历
     */
    public void middleShow(){
        if (left != null){
            left.middleShow();
        }
        System.out.println(value);
        if (right != null){
            right.middleShow();
        }
    }

    public void afterShow(){
        if (left != null){
            left.afterShow();
        }
        if (right != null){
            right.afterShow();
        }
        System.out.println(value);
    }

    /**
     * 前序查找
     * @param value
     * @return
     */
    public TreeNode frontSearch(int value){
        TreeNode target = null;
        if (this.value == value){
            return this;
        }else {
            if (left != null){
                target = left.frontSearch(value);
            }
            if (target != null){
                return target;
            }
            if (right != null){
                target = right.frontSearch(value);
            }
        }
        return target;
    }

    /**
     * 删除子树
     * @param value
     */
    public void delete(int value){
        TreeNode parent = this;
        if (parent.left != null && parent.left.getValue() == value){
            parent.left = null;
            return;
        }
        if (parent.right != null && parent.right.getValue() == value){
            parent.right = null;
            return;
        }
        parent = left;
        if (parent != null){
            parent.delete(value);
        }
        parent = right;
        if (parent != null){
            parent.delete(value);
        }
    }
}
