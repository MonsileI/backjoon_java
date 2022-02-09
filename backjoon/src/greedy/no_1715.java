package greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class no_1715 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long ans = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<N; i++) pq.add(scan.nextInt());
		
		int cnt=0;
		int value=0;
		while(!pq.isEmpty()) {
			if(cnt % 2 == 0) value=pq.poll();
			else {
				value += pq.poll();
				pq.add(value);
				ans += value;
			}
			
			cnt++;
		}
	
		System.out.println(ans);
	}
	
}
