package Today_22_04_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class robot {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][]map = new int[n][m];
		
		String position = br.readLine();
		String [] check = position.split(" ");
		
		int row = Integer.parseInt(check[0]);
		int col = Integer.parseInt(check[1]);
		int dir = Integer.parseInt(check[2]);
		
		//0 위 1 오른 2 남 3 서
		//0 -1 , 1,0 0,1 -1,0  돌아가네 위를 보고 있는거 기준 0 기준
		//-1,0 0,-1 1,0 0,1   1
		//0,1 -1,0 0,-1 1,0   2
		//1,0 1,0 -1,0 0,-1   3
		
 		
		for(int i=0;i<n;i++) 
			for(int j=0;j<m;j++)
				map[i][j] = Integer.parseInt(br.readLine());
		
		
		
		
		
		
		
		
	}
	public static void clean(int row,int col,int dir) {
		
		
		
		
	}
	
}
