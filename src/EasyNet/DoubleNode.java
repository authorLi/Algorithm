package EasyNet;

/**
 * @author mycclee
 * @createTime 2019/7/29 18:15
 */
public class DoubleNode {

    private int val;

    private DoubleNode pre = this;

    private DoubleNode next = this;

    public DoubleNode(int val){
        this.val = val;
    }

    /**
     * 增加节点
     * @param node
     */
    public void after(DoubleNode node){
        DoubleNode ok = this.next;
        this.next = node;
        node.pre = this;
        node.next = ok;
        ok.pre = node;
    }

    public DoubleNode next(){
        return this.next;
    }

    public DoubleNode pre(){
        return this.pre;
    }

    public int getVal(){
        return this.val;
    }
}
