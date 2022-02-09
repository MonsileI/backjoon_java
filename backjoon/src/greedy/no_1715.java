package greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class no_1715 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long ans = 0;
		
		//우선순위 큐를 사용
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		//입력받기(세팅완료)
		for(int i=0; i<N; i++) pq.add(scan.nextInt());
		//비교하기위해 cnt
		int cnt=0;
		int value=0;
		//모든 값을 다 연산할때까지 진행
		while(!pq.isEmpty()) {
			//cnt가 짝수(현재)   value=pq의 처음 값을 넣어주고 poll
			if(cnt % 2 == 0) value=pq.poll();
			else {
				//넣어줬던 10 += 다음값 반환(20이면 value==30인 상태)
				value += pq.poll();
				//pq에 30 넣어줌
				pq.add(value);
				//ans == 30 상태
				ans += value;
			}
			//cnt가 1이 됨.
			//cnt가 2가 됨
			cnt++;
		}
	
		System.out.println(ans);
	}
	
}
