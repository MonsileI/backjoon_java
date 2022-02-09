package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class no_10610 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		
		int sum=0;
		
		char[] charArr = N.toCharArray();
		
		Arrays.sort(charArr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=charArr.length-1;i<=0;i--) {
			
			int num = charArr[i] - '0';
			sum += num;
			sb.append(num);
		}
		
		
		if(charArr[0] != '0' || sum %3 != 0) {
			System.out.println(-1);
			return;
			
		}
		
		System.out.println(sb.toString());
		
	}
}
