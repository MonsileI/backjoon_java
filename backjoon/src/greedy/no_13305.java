package greedy;

import java.util.Scanner;

public class no_13305 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[]len = new int[N-1];
		
		int[]price = new int[N];
		
		for(int i=0;i<len.length;i++) {
			
			len[i] = scan.nextInt();
			
		}
		
		for(int i=0;i<price.length;i++) {
			
			price[i] = scan.nextInt();
			
			
		}
		
		long total = 0;
		long minCost = price[0];
		
		for(int i=0;i<N-1;i++) {
			
			
			if(price[i] < minCost) {
				minCost = price[i];
			}
			
			total += (minCost*len[i]);
			
		}
		
		System.out.println(total);
		
		
	}

}
