package EasyNet.Sort;

/**
 * @author mycclee
 * @createTime 2019/8/3 15:27
 */

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,4,3,2,1};
        solution(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void solution(int[] arr, int start, int finish) {
        if (start < finish){
            int standard = arr[start];
            int low = start;
            int high = finish;
            while (low < high){
                while (low < high && standard <= arr[high]){
                    high --;
                }
                arr[low] = arr[high];
                while (low < high && standard >= arr[low]){
                    low ++;
                }
                arr[high] = arr[low];
            }
            arr[low] = standard;
            solution(arr,start,low - 1);
            solution(arr,low + 1,finish);
        }
    }
}
