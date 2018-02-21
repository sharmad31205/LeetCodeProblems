package LeetCodeProblems;

import java.util.Arrays;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		
		if(strs == null || strs.length == 0) {
			return "";
		}
		
		Arrays.sort(strs);
		
		String small = strs[0];
		String large = strs[strs.length-1];
		
		int length = small.length() < large.length() ? small.length() : large.length();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < length; i++) {
			if(small.charAt(i) != large.charAt(i)) {
				break;
			}
			sb.append(small.charAt(i));
		}
		
		return sb.toString();
    }
}
