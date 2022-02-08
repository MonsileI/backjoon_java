package greedy;

import java.util.Scanner;

public class no_11047 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int N = scan.nextInt();
	int K = scan.nextInt();
	int[]arr= new int[N];
	
	for(int i=0;i<N;i++) {
		arr[i] = scan.nextInt();
		
	}
	///=======위까지 설정=======
	
	//동전 갯수 변수
	int count = 0;
	
	//큰것부터 해야되니까 for문 좀 반대로 돌려보자
	for(int i=N-1;i<=0;i--) {
		
		if(K>=arr[i]) {
			//count는 나눈 몫만큼 더해주고
			count += K/arr[i];
			//원래 값은 나누고 나머지만큼 변환(2배든 3배든 그럼 남을거 아녀)
			K = K % arr[i];
		}
		
		
			
		}
	}
}
