package EasyNet.Sort;

/**
 * @author mycclee
 * @createTime 2019/8/3 15:05
 */

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,9,4,2,6,8};
        solution(arr);
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void solution(int[] arr){
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1 - i;j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
