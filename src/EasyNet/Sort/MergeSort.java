package EasyNet.Sort;

/**
 * @author mycclee
 * @createTime 2019/8/4 10:58
 */

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 4, 2, 6, 8};
        solution(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void solution(int[] arr, int start, int finish) {
        if (start < finish){
            int mid = start + (finish - start) / 2;
            solution(arr,start,mid);
            solution(arr,mid + 1,finish);
            merge(arr,start,mid,finish);
        }
    }

    public static void merge(int[] arr, int start, int middle, int finish) {
        int i = start;
        int j = middle + 1;
        int[] temp = new int[arr.length];
        for (int x = start; x <= finish; x++) {
            temp[x] = arr[x];
        }

        for (int x = start; x <= finish; x++) {
            if (i > middle) {
                arr[x] = temp[j++];
            } else if (j > finish) {
                arr[x] = temp[i++];
            } else if (temp[i] <= temp[j]) {
                arr[x] = temp[i++];
            } else {
                arr[x] = temp[j++];
            }
        }

    }

}
