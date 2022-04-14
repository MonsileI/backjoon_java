package Today_22_04_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class jelda {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Problem = 1;
		
		int testCase = Integer.MAX_VALUE;
		
		ArrayList<String> list = new ArrayList<>();
		
		while(testCase!=0) {
		
		testCase = Integer.parseInt(br.readLine());
		int arr[][] = new int[testCase][testCase];
		int [][]temp = new int[testCase][testCase];
		
		for(int i=0;i<testCase;i++) {
			
			String s = br.readLine();
			String[]check = s.split(" ");
			for(int j=0;j<check.length;j++) {
				arr[i][j] = Integer.parseInt(check[j]);
			}
			
		}
		
		
		
		grandTheftAuto(arr[0][0],0,0,arr,temp);
		
			
		
		list.add("Problem "+Problem+": " + answer);
		
		Problem++;	
			
		}
		System.out.println(list);
		
	}
	
	static int answer = Integer.MAX_VALUE;
	
	public static void grandTheftAuto(int now,int i, int j,int[][]arr,int[][]temp) {
		
		
		if(i==arr.length-1&&j==arr.length-1) {
			System.out.println(now);
			answer = Math.min(answer, now);
			return;
		}
		
		int[] id = {1,1,0};
		int[] jd = {0,1,1};

		
		
		for(int d=0;d<3;d++) {
			
			int newI = i + id[d];
			int newJ = j + jd[d];
			if(newI<0||newJ<0||arr.length-1<newI||arr.length-1<newJ) continue;
			else if(temp[newI][newJ]==0) {
				temp[newI][newJ] = 1;
				now += arr[newI][newJ];
				grandTheftAuto(now,newI,newJ,arr,temp);
				now = arr[0][j];
				temp[newI][newJ] = 0;
				
			}
			
			
			
			
		}
		

	}
}
