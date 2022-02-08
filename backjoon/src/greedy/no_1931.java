package greedy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no_1931 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] M = new int[N][2];
		
		for(int i=0 ; i< M.length;i++) {
			
			for(int j=0;j<2;j++) {
				
				M[i][j] = scan.nextInt(); 
				
				
			}
			
		}
		
		//초기설정
		
		
		Arrays.sort(M, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) {
					//종료가 같으면 시작 시간이 빠르게(오름차순)
					//내림차순은 반대로 리턴하면 됨
					return o1[0] - o2[0];
					
				}
				//보통의 경우에 끝나는 시간으로 오름차순
				return o1[1] - o2[1];
				
			}
			
		});
		
		int count = 0;
		int end_time=0;
		
		for(int i=0; i<N; i++) {
			//만약 그전 회의시간의 끝나는 시간이 다음 배열의 시작 시간보다 작다면
			if(end_time <= M[i][0]) {
				//회의를 할 수 있으니, count++해주고,
				//end_time에 이 회의의 끝나는 시간을 넣어주면 되지
				end_time = M[i][1];
				count++;
			}
			
		}
		
		System.out.println(count);
	}
}
