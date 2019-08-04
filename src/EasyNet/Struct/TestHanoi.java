package EasyNet.Struct;

/**
 * @author mycclee
 * @createTime 2019/8/3 11:05
 */
public class TestHanoi {

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }

    /**
     * @param n    共有n个盘子
     * @param from 开始的柱子
     * @param in   中间的柱子
     * @param to   目标柱子
     */
    public static void hanoi(int n, char from, char in, char to) {
        if (n == 1) {
            System.out.println("第1个盘子从 " + from + " 移到 " + to);
        } else {
            //除了最下面一个的所有移到中间位置
            hanoi(n - 1, from, to, in);
            System.out.println("第" + n + "个盘子从 " + from + " 移到 " + to);
            hanoi(n - 1, in, from, to);
        }
    }
}
