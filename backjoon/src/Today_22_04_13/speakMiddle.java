package Today_22_04_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class speakMiddle {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		int[]arr = new int[n];
		int[]answer = new int[n];
		
		for(int i=0;i<n;i++) arr[i] = Integer.parseInt(br.readLine());
		
		for(int i=0;i<arr.length;i++) {
			
			int[]temp = Arrays.copyOf(arr, i+1);
			Arrays.sort(temp);
			if(temp.length%2==0) answer[i] = temp[temp.length/2-1];
			else answer[i] = temp[temp.length/2];
		
		}
		
		for(int i : answer) System.out.println(i);
		
		
		
		
	}
}
