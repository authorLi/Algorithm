package LeetCode;

/**
 * @author mycclee
 * @createTime 2019/7/28 20:43
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 1-不对应任何字符,2-abc,3-def,4-ghi,5-jkl,6-mno,7-pqrs,8-tuv,9-wxyz
 *
 * 题意类似九键输入结果的集合
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 */
public class Lession17 {

    public static void main(String[] args) {
        List<String> list = solution("23");
        System.out.println(list);
    }

    public static List<String> solution(String digits){
        List<String> res = new LinkedList<>();
        HashMap<Character,char[]> map = new HashMap<>();
        if (digits == null || digits.length() == 0){
            return res;
        }
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});

        helper("",0,digits,res,map);
        return res;
    }

    public static void helper(String cur,int curIndex,String digits,List<String> res,HashMap<Character,char[]> map){
        if (curIndex == digits.length()){
            res.add(cur);
        }else {
            char c = digits.charAt(curIndex);
            if (map.containsKey(c)){
                for (char ch : map.get(c)){
                    helper(cur + ch,curIndex + 1,digits,res,map);
                }
            }
        }
    }
}
