package Programmers_Level_1;

import java.util.ArrayList;
import java.util.Arrays;



public class sosu_Summer_Winter {

	public static void main(String[] args) {
		
		int temp = 0;
		int[]nums = {1,2,3,4};
		int result = 0;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			if(i + 2 >= nums.length) {
				break;
			}
				for(int j=i+1;j<nums.length;j++) {
					for(int h=j+1;h<nums.length;h++) {
						al.add(nums[i]+nums[j]+nums[h]);
					}
				}	
		}
		
	       for(Integer i : al) {
	        	int count = 2;
	        	result++;
	        	while(count < i) {
			
	        		if(i % count == 0) {
	        			result--;
	        			break;
	        		}
	        		count++;
	        	}
	        }
		
	       System.out.println(result);
	}
		
}
