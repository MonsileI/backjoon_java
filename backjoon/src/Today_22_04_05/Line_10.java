package Today_22_04_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Line_10 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int count = 0;
			
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			count++;
			if(count==10) {
				System.out.println();
				count = 0;
			}
			
		}
	
	}	
	
}
