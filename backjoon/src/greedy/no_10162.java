package greedy;

import java.util.Scanner;

public class no_10162 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		//A=300 B=60 C=10
		int[][]arr = {
						{300,0},
						{60,0},
						{10,0},
							};
		
		int count=0;
		
		if(T%300 ==0||T%60 ==0||T%10 ==0) {
				for(int i=0;i<arr.length;i++) {
				
					if(T>=arr[i][0]) {
					
					arr[i][1] = T/(arr[i][0]);
					T = T%arr[i][0];
					
				}
				
			}
			
			System.out.println(arr[0][1]+" "+arr[1][1]+" "+arr[2][1]);
			
			
		}else{
		
			
			System.out.println(-1);
			
		
		
	}
}

}