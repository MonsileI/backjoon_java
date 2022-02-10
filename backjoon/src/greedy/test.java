package greedy;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	String S = scan.next();
	
	char[]arr= S.toCharArray();
	
	int zero = 0;
	int one = 0;
	
	if(arr[0]=='0') {
		zero++;
	}else {
		one++;
	}
	
	for(int i=1;i<S.length();i++) {
		
		if(arr[i]!=arr[i-1]) {
			
			if(arr[i]=='0') {
				zero++;
			}else {
				one++;
			}
			
		}
		
	
		
		
	}
	
	
	System.out.println(Math.min(zero, one));
		
	
	}
}
