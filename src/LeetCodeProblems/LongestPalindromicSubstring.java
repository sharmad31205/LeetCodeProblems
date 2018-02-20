package LeetCodeProblems;

public class LongestPalindromicSubstring {
	
	int max = 0;
    int lo = 0;
    
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        
        for(int i = 0; i < s.length(); i++){
            lengthOfPalindrome(s,i,i);
            lengthOfPalindrome(s,i,i+1);
        }
        
        return s.substring(lo,lo+max);
    }
    
    public void lengthOfPalindrome(String s, int left, int right){
    
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
        }
        
        if(max < right-left-1){
            lo = left+1;
            max = right-left-1;
        }
        
    }
}
