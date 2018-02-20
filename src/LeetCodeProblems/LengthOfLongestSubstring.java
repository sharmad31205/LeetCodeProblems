package LeetCodeProblems;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {


	public int lengthOfLongestSubstring(String s) {
        
        if(s == null || s.length() == 0){
            return 0;
        }
        
        Set<Character> set = new HashSet<>();
        
        int i = 0; int j = 0;
        
        int max = 0;
        
        
        while(j < s.length()){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }
            else{
                set.add(s.charAt(j++));
                max = Math.max(set.size(), max);
            }
        }
        
        return max;
    }
}
