package Today_22_04_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class piv_dp {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[]arr = new int[n+1];
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3;i<=n;i++) {
			
			arr[i] = arr[i-1] + arr[i-2];
			
		}
		
		System.out.println(arr[n]);
	}

}
