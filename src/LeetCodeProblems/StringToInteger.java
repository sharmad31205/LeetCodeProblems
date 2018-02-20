package LeetCodeProblems;

public class StringToInteger {
	
	 public static int myAtoi(String str) {
		 
		 if(str == null || str.length() == 0) {
			 return 0;
		 }
		 
		 str = str.trim();
		 
		 int sign = str.charAt(0) == '-' ? -1 : 1;
		 
		 int i = 0;
		 if(str.charAt(0) == '-' || str.charAt(0) == '+') {
			 i = 1;
		 }
		 
		 long res = 0;
		 
		 for(; i < str.length(); i++) {
			 if(!Character.isDigit(str.charAt(i))){
				 return (int)res * sign;
			 }
			 
			 int temp = str.charAt(i) - '0';
			 res *= 10;
			 res += temp;
			 
			 if(res > Integer.MAX_VALUE && sign == -1) {
				 return Integer.MIN_VALUE;
			 }
			 
			 if(res > Integer.MAX_VALUE) {
				 return Integer.MAX_VALUE;
			 }
			 
		 }
		 
		 return (int)res * sign;
	 }
	 
	 public static void main(String[] args) {
		 int res = myAtoi("2147483648");
		 System.out.println(res);
	 }
}
