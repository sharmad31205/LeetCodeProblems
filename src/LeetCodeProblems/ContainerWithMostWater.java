package LeetCodeProblems;

public class ContainerWithMostWater {
	
	public int maxArea(int[] height) {
        
		if(height == null || height.length == 0) {
			return 0;
		}
		
		int max = 0;
		
		int i = 0; int j = height.length-1;
		
		while(i < j) {
			int temp = Math.min(height[i], height[j]) * (j-i);
			max = Math.max(temp, max);
			
			if(height[i] < height[j]) {
				i++;
			}
			else {
				j--;
			}
		}
		
		return max;
    }
}
