package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no_1049 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int N = scan.nextInt();//끊어진 기타줄
	int M = scan.nextInt();//기타줄 브랜드
	
	int[]pack = new int[M];
	int[]unit = new int[M];
	
	for(int i=0;i<M;i++) {
		
		pack[i] = scan.nextInt();
		unit[i] = scan.nextInt();
		
	}
	//세팅완료========================
	Arrays.sort(pack);
	Arrays.sort(unit);

	int min = 0;
	min = Math.min(((N/6)+1)*pack[0], N*unit[0]);    
	min = Math.min(min, ((N/6))*pack[0] + (N%6)*unit[0]);
	System.out.println(min);
	
	}
}
