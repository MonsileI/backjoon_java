package Programmers_Level_1;

import java.util.Arrays;

public class budget {
	
	public static void main(String[] args) {
		
		
		int[]d = {2,2,3,3};
		
		int budget = 10;
		
		int answer = 0;
		
		
		Arrays.sort(d);
		
		
		for(int i=0;i<=d.length-1;i++) {
			
			
			budget -= d[i];
			
			
			
			if(budget<0) {
				
				break;
			}
			
			
			answer++;
			
			
		}
		
		
		System.out.println(answer);
		
	}

}

