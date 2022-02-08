package greedy;

import java.util.Scanner;

public class no_2839 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		
		//무게 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 ...
		//개수 1 x 1 2 x 2 3 2  3  4  3  x  3  4  x  4  5  4  4  6  5  x ... 
		
		//규칙 -> 4나 7의 배수면 불가능
		// 5로 나눈 나머지가 5면 N/5
		// 5로 나눈 나머지가 1,3이면 N/5 +1
		// 5로 나눈 나머지가 2,4면 N/5 +2
		
		if(N==4||N==7) {
			
			System.out.println(-1);
			
		}else if(N%5==0) {
			
			System.out.println(N/5);
		}else if(N%5==1||N%5==3) {
			System.out.println((N/5)+1);
			
		}else if(N%5==2||N%5==4) {
			
			System.out.println((N/5)+2);
			
		}
		
		
		
	}

}
