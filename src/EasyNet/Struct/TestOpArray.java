package EasyNet.Struct;

/**
 * @author mycclee
 * @createTime 2019/7/28 11:48
 */

import org.junit.Test;

import java.util.Arrays;

/**
 * 数组的添加元素问题：创建一个新数组，长度为原来的长度+1，把原数组中的数据复制到新数组中，再把目标元素放入新数组中，最后用新数组替换原数组
 * 数组的删除元素问题：删除第n个元素，位置（n - 1）前的元素不用动，（n - 1）之后的元素都向前移动一位
 */
public class TestOpArray {

    @Test
    public  void add() {
        int[] array = new int[]{9,8,7,6,5};
        System.out.println(Arrays.toString(array));

        //要加入的新元素
        int dst = 6;

        int newLength = array.length + 1;
        int[] newArr = new int[newLength];
        for (int i = 0;i < array.length;i++){
            newArr[i] = array[i];
        }
        newArr[newLength - 1] = dst;
        System.out.println(Arrays.toString(newArr));
        array = newArr;
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void delete(){
        int[] arr = new int[]{9,8,7,6,5};
        int n = 3;
//        for (int i = n;i < arr.length;i++){
//            System.out.println(i);
//            arr[i - 1] = arr[i];
//        }
//        arr[arr.length - 1] = 0;
//        System.out.println(Arrays.toString(arr));

        int newLength = arr.length - 1;
        int[] newArr = new int[newLength];
        for (int i = 0;i < arr.length;i++){
            if (i < n - 1){
                newArr[i] = arr[i];
            }else if (i >= n){
                newArr[i - 1] = arr[i];
            }
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));

    }
}
