package EasyNet.Sort;

/**
 * @author mycclee
 * @createTime 2019/8/4 10:08
 */

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,9,4,2,6,8};
        solution(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void solution(int[] arr){
        for (int i = 0;i < arr.length;i++){
            for (int j = i;j > 0;j--){
                if (arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
