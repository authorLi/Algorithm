package LeetCode;

/**
 * @author mycclee
 * @createTime 2019/7/19 21:20
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class Lession15 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(solution(nums));
    }

    public static ArrayList<List<Integer>> solution(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (nums.length <= 2 || nums == null) {
            return res;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while (i < n - 2) {
            int base = nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right){
                int sum = base + nums[left] + nums[right];
                if (sum == 0){
                    LinkedList<Integer> list = new LinkedList<>();
                    list.add(base);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left = moveLeft(nums,left + 1);
                    right = moveRigt(nums,right - 1);
                }else if (sum > 0){
                    right = moveRigt(nums,right - 1);
                }else {
                    left = moveLeft(nums,left + 1);
                }
            }
            i = moveLeft(nums,i + 1);
        }
        return res;

    }

    public static int moveLeft(int[] nums,int left){
       while (left == 0 || (left < nums.length && nums[left] == nums[left - 1])){
            left++;
        }
        return left;
    }

    public static int moveRigt(int[] nums,int right){
        while (right == nums.length - 1 || (right >= 0 && nums[right] == nums[right + 1])){
            right--;
        }
        return right;
    }
}
