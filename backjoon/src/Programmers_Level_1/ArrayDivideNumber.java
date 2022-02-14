package Programmers_Level_1;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDivideNumber {
	
	public static void main(String[] args) {
		
		 int[] arr = {5, 9, 7, 10};
		 int divisor = 5;
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
		 Arrays.sort(arr);
		 
		 for(int i=0; i<arr.length;i++) {
			 
			 if(arr[i]%5==0) {
				 list.add(arr[i]); 
			 }	 
		 }
		 if(list.size()>0) {
			 int[] answer = new int[list.size()];
			 for(int i=0;i<list.size();i++) {
				 answer[i] = list.get(i);
			 }
			 System.out.println(answer[0]);
			 
		 }else {
			 int[] answer = {-1};
			 System.out.println(answer);
			
		 }
	    	 
	    	 
		 
	     
		
	}

}
