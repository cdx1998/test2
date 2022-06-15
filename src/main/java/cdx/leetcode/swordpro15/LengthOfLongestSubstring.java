package cdx.leetcode.swordpro15;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname LengthOfLongestSubstring
 * @Description TODO
 * @Date 2022/5/8 22:04
 * @Author CDX
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "tmmzuxt";
        LengthOfLongestSubstring obj = new LengthOfLongestSubstring();
        System.out.println(obj.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        int l = 0, r = 0;
        while(r < n){
            char c = s.charAt(r);
            if(map.containsKey(c) && map.get(c) >= l){
                l = map.get(c) + 1;
            }else{
                ans = Math.max(ans,r-l+1);
            }
            map.put(c,r);
            r++;
        }
        return ans;
    }

}
