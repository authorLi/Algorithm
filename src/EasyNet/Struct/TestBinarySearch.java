package EasyNet.Struct;

/**
 * @author mycclee
 * @createTime 2019/7/28 15:41
 */

/**
 * 二分查找
 */
public class TestBinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(solution(arr, 5, 0, arr.length));
    }

    public static int solution(int[] arr,int target,int start,int finish){
        while(true){
            int zj = (start + finish) / 2;
            if (target == arr[zj]){
                return zj + 1;
            }
            if (target > arr[zj]){
                start = zj + 1;
            }else if (target < arr[zj]){
                finish = zj - 1;
            }
        }
    }

}
