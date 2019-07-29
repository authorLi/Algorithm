package LeetCode;

/**
 * @author mycclee
 * @createTime 2019/7/16 21:57
 */

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestStringWithoutRepeat {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(solution(s));
    }

    public static int solution(String s){
        if (null == s || s.length() == 0){
            return 0;
        }
        int left = 0;
        int right = 0;
        boolean[] b = new boolean[128];
        int max = 0;
        int n = s.length();
        while(right < n){
            if (b[s.charAt(right)] == false){
                b[s.charAt(right)]= true;
                right++ ;
            }else {
                max = Math.max(max,right - left);
                while(left < right && s.charAt(right) != s.charAt(left)){
                    b[s.charAt(left)] = false;
                    left++ ;
                }
                left++ ;
                right++ ;
            }
        }
        max = Math.max(max,right - left);
        return max;
    }
}
