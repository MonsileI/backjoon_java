package Today_22_04_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class roomNumber {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		int [] num = new int[10];
		
		for(char c : n.toCharArray()) {
			
			int check = c-'0';
			
			if(check==6)check=9;
			
			num[check]++;
			
			
		}
		
		num[9] = num[9]/2 + num[9]%2;
		
		Arrays.sort(num);
		
		System.out.println(num[9]);
		
	}

}
