package Programmers_Level_1;

public class divisorplus {
	
	public static void main(String[] args) {
		
		int answer=0;
		int n = 12;

		for(int i=1;i<=n ;i++) {
			
			if(n%i==0) {
				
				answer += i;
				
			}
			
		}
		
		System.out.println(answer);
	}

}
