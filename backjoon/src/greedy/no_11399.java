package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class no_11399 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int [] arr = new int[N];
		
		for(int i=0; i < N; i++) {
			
			arr[i] = scan.nextInt();
			
		}
		//일단 최소부터 줄 세워야 되니까 sort 이용
		Arrays.sort(arr);
		
		int sum = 0;
		int temp = 0;
		
		for(int i=0; i<arr.length;i++) {
			//배열이 {1,2...}라면, 첫번째 사람이 1, 두번째 사람은 1+2
			temp += arr[i];
			sum += temp;
			
		}
		
		System.out.println(sum);
	}

}
