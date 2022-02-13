package Programmers_Level_1;

import java.util.Arrays;

public class numberRemainder {

	public static void main(String[] args) {
		
	int n = 12;
	
	int num = 0;
	for(int i=1; i<=n;i++) {
		
		if(n%i==1) {
			
			num = i;
			break;
		
		}
		
	}
		System.out.println(num);
		
	}
}
