package Programmers_Level_1;

import java.util.ArrayList;

public class HateSameNumber {

	public static void main(String[] args) {
		
	 int[]arr= {1,1,3,3,0,1,1};
	
	 ArrayList<Integer>list = new ArrayList<>();
	 
	 int temp=arr[0];
	 list.add(temp);
	 for(int i=1;i<arr.length;i++) {
		 
		 if(temp!=arr[i]) {
			 list.add(arr[i]);
			 temp=arr[i];
			 
		 }
		 
		 
		 
	 }
	 
	 int[]answer = new int[list.size()];
	 
	 for(int i=0;i<answer.length;i++) {
		 
		 answer[i] = list.get(i);
		 
	 }
	 
	 System.out.println(answer);
	
	 
	}
}
