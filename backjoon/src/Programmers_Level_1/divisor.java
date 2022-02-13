package Programmers_Level_1;

public class divisor {
	
	public static void main(String[] args) {
		
		int left = 13;
		int right = 17;
		int answer = 0;
		
		for(int i=left;i<=right;i++) {
			
			int temp = 0;
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					temp++;
					}
				}
			
			if(temp%2==0) {
				
				answer += i;	
			}else {
				answer -= i;
			}
		}

		System.out.println(answer);
	}
		
}


