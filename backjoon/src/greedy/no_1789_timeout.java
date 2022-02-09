package greedy;

import java.util.Scanner;

public class no_1789_timeout {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long S = scan.nextLong();
		
		int count =0;
		int sum = 0;
		
		for(int i=1; i<S; i++) {
			
			if(S>=sum+i) {
				
				count++;
				sum = sum+i;
				
			}
			
			
		}
		
		System.out.println(count);
		
	}

}
