package EasyNet;

/**
 * @author mycclee
 * @createTime 2019/7/28 15:37
 */
public class TestSearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};

        int dst = 7;

        boolean flag = false;
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == dst){
                System.out.println(i + 1);
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("根本就没有！！！");
        }
    }
}
