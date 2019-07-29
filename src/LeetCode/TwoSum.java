package LeetCode;

/**
 * @author mycclee
 * @createTime 2019/7/9 21:41
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] result = twoSum2(nums,9);
        for (int i = 0;i < result.length;i++){
            System.out.println(result[i]);
        }
    }

    /**
     *
     * @param nums
     * @param target
     * @return O(n2)
     */
    public static int[] twoSum1(int[] nums,int target){
        int[] ret = new int[2];
        if (nums == null || nums.length <= 1){
            return ret;
        }
        for (int i = 0;i < nums.length;i++){
            int x = nums[i];
            int y = target - x;
            for (int j = i + 1;j < nums.length;j++){
                if (nums[j] == y){
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }

    /**
     *
     * @param nums
     * @param target
     * @return O(n)
     */
    public static int[] twoSum2(int[] nums,int target){
        int[] ret = new int[2];
        if (ret == null || ret.length <= 1){
            return ret;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            int x = target - nums[i];
            if (map.containsKey(x)){
                ret[0] = map.get(x);
                ret[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return ret;
    }
}
