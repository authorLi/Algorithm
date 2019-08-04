package EasyNet.Sort;

/**
 * @author mycclee
 * @createTime 2019/8/4 10:19
 */

/**
 * 希尔排序
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,9,4,2,6,8};
        solution(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void solution(int[] arr){
        int length = arr.length / 2;
        for (int d = length;d > 0;d /= 2){
            for (int i = d;i < arr.length;i++){
                for (int j = i - d;j >= 0;j -= d){
                    if (arr[j] > arr[j + d]){
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }
            }
        }
    }
}
