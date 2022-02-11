package Programmers_Level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class emptyNumber_MonthlyChallenge {

	public static void main(String[] args) throws IOException {
		
	int[] numbers = {1,2,3,4,6,7,8,0};
	int result = 0;
	
	
	java java = new java();
	
	int comp = java.comp();
	
	int sum = 0;
	
	for(int i=0;i<numbers.length;i++) {
		
		sum += numbers[i];
		
	}
	
	result = comp-sum;
	
	System.out.println(result);
		
	
	
	}
}

	class java{
		
		public static int comp() {
			
			int number = 0;
			
			for(int i=0;i<=9;i++) {
				number += i;
			}
		
			
			return number;
			
		}
		
	}
