package EasyNet.Sort;

/**
 * @author mycclee
 * @createTime 2019/8/4 11:38
 */

import EasyNet.Struct.MyQueue;

/**
 * 基数排序(基于队列实现)
 */
public class RadixQueueSort {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 53, 21, 321, 246, 14, 121, 4, 123, 678};
        solution(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void solution(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxLength = (max + "").length();
        MyQueue[] temp = new MyQueue[10];
        for (int i = 0;i < temp.length;i++){
            temp[i] = new MyQueue();
        }
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                //计算余数
                int ys = (arr[j] / n) % 10;
                temp[ys].push(arr[j]);
            }
//            if (i == 0){
//                for (int[] a : temp){
//                    System.out.println(Arrays.toString(a));
//                }
//                System.out.println(Arrays.toString(count));
//            }
            int index = 0;
            for (int k = 0; k < temp.length; k++) {
                while (!temp[k].isEmpty()) {
                    arr[index] = temp[k].pop();
                    index++;
                }
            }
        }
    }
}
