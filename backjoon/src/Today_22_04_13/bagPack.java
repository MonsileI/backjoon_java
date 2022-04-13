package Today_22_04_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bagPack {
	
	static int answer = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String first = br.readLine();
		String[]temp1 = first.split(" ");
		
		int round = Integer.parseInt(temp1[0]);
		int k = Integer.parseInt(temp1[1]);
		
		int []arr = new int[round];
		int []value = new int[round];
		boolean[]visited = new boolean[round];
		for(int i=0;i<round;i++) {
			
			String check = br.readLine();
			String []temp = check.split(" ");
			arr[i] = Integer.parseInt(temp[0]);
			value[i] = Integer.parseInt(temp[1]);
			
		}
		dfs(0,visited,arr,value,k);
		
		System.out.println(answer);
	
		
		
	}
	static void dfs(int count,boolean[]visited,int[]arr,int[]value,int k) {
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(!visited[i] && k-arr[i] >= 0) {
				visited[i] = true;
				dfs(count+value[i],visited,arr,value,k-arr[i]);
				visited[i] = false;
			}
			
			answer = Math.max(answer, count);
		}
		
	}

}
