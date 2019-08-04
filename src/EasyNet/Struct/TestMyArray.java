package EasyNet.Struct;

/**
 * @author mycclee
 * @createTime 2019/7/28 14:49
 */
public class TestMyArray {
    public static void main(String[] args) {
        MyArrayUtil myArrayUtil = new MyArrayUtil();
        System.out.println(myArrayUtil.size());
        myArrayUtil.add(1);
        myArrayUtil.add(2);
        myArrayUtil.add(3);
        myArrayUtil.show();
        System.out.println(myArrayUtil.size());
        myArrayUtil.delete(1);
        myArrayUtil.show();
        System.out.println(myArrayUtil.get(2));
        myArrayUtil.add(1,1);
        myArrayUtil.add(4,4);
        myArrayUtil.add(5,5);
        myArrayUtil.show();
        System.out.println(myArrayUtil.search(5));
        System.out.println(myArrayUtil.binarySearch(7));
    }
}
