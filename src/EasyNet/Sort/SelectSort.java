package EasyNet.Sort;

/**
 * @author mycclee
 * @createTime 2019/8/4 10:46
 */

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,9,4,2,6,8};
        solution(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void solution(int[] arr){
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = i + 1;j < arr.length;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
