import java.util.*;

public class LeetCode3 {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;

        int j=0;
        int max=0;
        Set<Character> set= new HashSet();

        for(int i=0; i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            max= Math.max(max, set.size());
        }
        return max;
    }
}
