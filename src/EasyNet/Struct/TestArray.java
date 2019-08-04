package EasyNet.Struct;

import java.util.Arrays;

/**
 * @author mycclee
 * @createTime 2019/7/28 11:27
 */
public class TestArray {

    public static void main(String[] args) {
        int[] arr1 = new int[3];

        System.out.println(arr1.length);
//        for (int i = 0;i < arr1.length;i++){
//            arr1[i] = i + 1;
//        }
        arr1[0] = 'a';
//        for (int i = 0;i < arr1.length;i++){
//            System.out.println(arr1[i]);
//        }

        System.out.println(Arrays.toString(arr1));
    }
}
