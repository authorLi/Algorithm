package EasyNet.Struct;

/**
 * @author mycclee
 * @createTime 2019/7/29 18:04
 */
public class LoopNode {

    private int val;

    private LoopNode next = this;

    public LoopNode(int val){
        this.val = val;
    }

    public void after(LoopNode node){
        node.next = this.next;
        this.next = node;
    }

    public void removeNext(){
        this.next = this.next.next;
    }

    public int getVal(){
        return this.val;
    }

    public LoopNode next(){
        return this.next;
    }
}
