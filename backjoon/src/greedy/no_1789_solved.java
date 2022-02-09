package greedy;

import java.util.Scanner;

public class no_1789_solved {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long S = scan.nextLong();
		
		int add =0;
		int sum = 0;
		
		while(S >= sum) {
			sum += (++add);
		}
		
		System.out.println(add-1);
		
	}

}
