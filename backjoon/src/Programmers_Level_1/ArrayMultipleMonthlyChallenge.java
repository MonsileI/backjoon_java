package Programmers_Level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class ArrayMultipleMonthlyChallenge {

	public static void main(String[] args) throws IOException {
		
		int[]a = {1,2,3,4};		
		int[]b = {-3,-1,0,2};		
		
		int result = 0;
		
		for(int i=0;i<a.length;i++) {
			
			result += a[i]*b[i];
		}
		
		System.out.println(result);
		
	}
		
}
