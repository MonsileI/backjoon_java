package Programmers_Level_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Two_number {

	public static void main(String[] args) {
		
		int[]numbers = {2,1,3,4,1};
	
		HashSet<Integer> hash = new HashSet<>();
		int temp;
		
		for(int i=0;i<numbers.length;i++) {
			
			
			
			for(int j=i+1;j<numbers.length;j++) {
				
				temp = numbers[i]+numbers[j];
				
				hash.add(temp);
				
				temp=0;
				
			}
			
			
		}
		Iterator<Integer> it = hash.iterator();
		int[] answer = new int[hash.size()];
		for(int i=0;i<hash.size();i++) {
			
			answer[i] = it.next();
	
		}
		
		Arrays.sort(answer);
		
	
	}
}
