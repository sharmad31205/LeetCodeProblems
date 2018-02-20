package LeetCodeProblems;

import java.util.Stack;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		
		if(x < 0) {
			return false;
		}
		
		String number = String.valueOf(x);
		
		Stack<Character> stack = new Stack<>();
		int i = 0;
		for(; i < number.length()/2; i++) {
			stack.push(number.charAt(i));
		}
		
		if(number.length()%2 != 0) {
			i++;
		}
		
		while(i < number.length()) {
			if(stack.pop() != number.charAt(i)) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean res = isPalindrome(10);
		System.out.println(res);
	}
}
