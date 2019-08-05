package EasyNet.Tree;

/**
 * @author mycclee
 * @createTime 2019/8/5 9:28
 */
public class BinaryTree {

    private TreeNode root;

    public void setRoot(TreeNode node){
        this.root = node;
    }

    public TreeNode getRoot(){
        return this.root;
    }

    public void frontShow(){
        if (root != null){
            root.frontShow();
        }
    }

    public void middleShow(){
        if (root != null){
            root.middleShow();
        }
    }

    public void afterShow(){
        if (root != null){
            root.afterShow();
        }
    }

    public TreeNode frontSearch(int value){
        return root.frontSearch(value);
    }

    public void delete(int value){
        if (root.getValue() == value){
            root = null;
        }else {
            root.delete(value);
        }
    }

}
