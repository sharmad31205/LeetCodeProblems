package LeetCodeProblems;

public class ReverseInteger {

public int reverse(int x) {
        
        int sign = 1;
        
        if(x < 0){
            sign = -1;
        }
        
        long res = 0;
        
        while(x != 0){
            long temp = x % 10;
            res *= 10;
            res += temp;
            
            if(res > Integer.MAX_VALUE){
                return 0;
            }
            
            if(res < Integer.MIN_VALUE){
                return 0;
            }
            
            x = x/10;
        }
        
        return (int)res;
    }
}
