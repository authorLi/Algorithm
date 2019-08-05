package EasyNet.Tree;

/**
 * @author mycclee
 * @createTime 2019/8/5 10:34
 */

/**
 * 顺序存储二叉树
 */
public class ArrayBinaryTree {

    private int[] data;

    public ArrayBinaryTree(int[] data){
        this.data = data;
    }

    public int[] getData(){
        return this.data;
    }

    public void frontShow(){
        frontShow(0);
    }

    /**
     * 前序遍历
     * @param index
     */
    public void frontShow(int index){
        if (data == null || data.length == 0){
            return;
        }
        System.out.println(data[index]);
        if ((2 * index + 1) < data.length){
            frontShow(2 * index + 1);
        }
        if ((2 * index + 2) < data.length){
            frontShow(2 * index + 2);
        }
    }
}
