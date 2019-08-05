package EasyNet.Sort;

/**
 * @author mycclee
 * @createTime 2019/8/5 10:52
 */

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 4, 2, 6, 8};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void solution(int[] arr) {
        int start = (arr.length - 1) / 2;
        for (int i = start;i >= 0;i--){
            maxHeap(arr,arr.length,i);
        }
        for (int i = arr.length - 1;i > 0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr,i,0);
        }
    }

    public static void maxHeap(int[] arr,int size,int index){
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int max = index;
        if (left < size && arr[left] > arr[max]){
            max = left;
        }
        if (right < size && arr[right] > arr[max]){
            max = right;
        }
        if (max != index){
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            maxHeap(arr,size,max);
        }

    }
}
