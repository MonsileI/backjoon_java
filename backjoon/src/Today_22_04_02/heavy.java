package Today_22_04_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class heavy {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] check = new String[n];
		int[][]num = new int[n][2];
		for(int i=0;i<check.length;i++) {
			check[i] = br.readLine();
			String [] temp = check[i].split(" ");
			num[i][0] = Integer.parseInt(temp[0]); 
			num[i][1] = Integer.parseInt(temp[1]); 
		}
		
		int [] answer = new int[n];
		
		for(int i=0;i<n;i++) {
			int rank = 1;
			for(int j=0;j<n;j++) {
				if(i==j) continue;
				if(num[i][0]<num[j][0]&&num[i][1]<num[j][1]) rank++;
			}
			answer[i] = rank;
		}
		
		for(int i : answer)System.out.println(i);
		
	}
}
