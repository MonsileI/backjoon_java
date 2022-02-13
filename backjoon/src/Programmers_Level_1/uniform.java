package Programmers_Level_1;


import java.util.HashSet;

public class uniform {

    public static void main(String[] args) {
        
    	int[] nums = {3,3,3,2,2,2};
    	int answer = 0;
    	HashSet<Integer> hash = new HashSet<>(); 
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		hash.add(nums[i]);
    		
    		if(hash.size()==(nums.length)/2) {
    			
    			break;
    			
    			
    		}
    		
    		
    	}
    	
    	answer = hash.size();
    	System.out.println(answer);
    
        
    }
}