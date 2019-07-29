package LeetCode;

/**
 * @author mycclee
 * @createTime 2019/7/28 20:05
 */

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 */
public class Lession16 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        System.out.println(solution(1,nums));
    }

    public static int solution(int target,int[] nums){
        if (nums == null || nums.length == 0){
            return target;
        }
        Arrays.sort(nums);
        int delta = nums[0] + nums[1] + nums[2] - target;
        for (int i = 0;i < nums.length - 2;i++){
            int start = i + 1;
            int finish = nums.length - 1;
            while (start < finish){
                int newDelta = nums[i] + nums[start] + nums[finish] - target;
                if (newDelta == 0){
                    return newDelta;
                }
                if (Math.abs(newDelta) < Math.abs(delta)){
                    delta = newDelta;
                }
                //判断newDelta应该往大了变还是往小了变，期望是越接近0越好
                if (newDelta < 0){
                    start++;
                }else {
                    finish--;
                }
            }
        }
        return target + delta;
    }
}
