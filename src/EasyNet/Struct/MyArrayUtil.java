package EasyNet.Struct;

import java.util.Arrays;

/**
 * @author mycclee
 * @createTime 2019/7/28 14:45
 */

/**
 * 封装好的数组的类
 */
public class MyArrayUtil {

    private int[] elements;

    private int newLength;

    private int[] newArr;

    public MyArrayUtil(){
        elements = new int[0];
    }

    public int size(){
        return elements.length;
    }

    public void add(int element){
        newLength = elements.length + 1;
        int[] newArr = new int[newLength];
        for (int i = 0;i < elements.length;i++){
            newArr[i] = elements[i];
        }
        newArr[newLength - 1] = element;
        elements = newArr;
    }

    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    public void delete(int index){
        newLength = elements.length - 1;
        if (index > newLength || index < 0){
            throw new RuntimeException("请输入正确的下标");
        }
        newArr = new int[newLength];
        for (int i = 0;i < elements.length;i++){
            if (i < index - 1){
                newArr[i] = elements[i];
            }else if (i >= index){
                newArr[i - 1] = elements[i];
            }
        }
        elements = newArr;
    }

    public int get(int index){
        return elements[index - 1];
    }

    public void add(int index,int element){
        newLength = elements.length + 1;
        newArr = new int[newLength];
        for (int i = 0;i < newLength;i++){
            if (i < index - 1){
                newArr[i] = elements[i];
            }else if (i >= index){
                newArr[i] = elements[i - 1];
            }
        }
        newArr[index - 1] = element;
        elements = newArr;
    }

    //线性查找
    public int search(int target){
        for (int i = 0;i < elements.length;i++){
            if (elements[i] == target){
                return i + 1;
            }
        }
        return -1;
    }

    //二分查找
    public int binarySearch(int target){
        int start = 0;
        int finish = elements.length;
        int mid = (finish - start) / 2 + start;
        while (true){
            if (start >= finish){
                return -1;
            }
            if (target == elements[mid]){
                return mid + 1;
            }else {
                if (target > elements[mid]){
                    start = mid + 1;
                }else {
                    finish = mid - 1;
                }
                mid = (finish - start) / 2 + start;
            }
        }
    }
}
