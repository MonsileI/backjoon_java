package Today_22_04_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class zero2 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][]arr = new int[n][m];
		
		for(int i=0;i<arr.length;i++) 
			for(int j=0;j<arr[0].length;j++) 
				arr[i][j] = Integer.parseInt(br.readLine());
			
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) 
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==1) {
					
				}
				
			}
				
			
		
		
		
	}

}
