package Programmers_Level_1;

public class indigentPrice {

	public static void main(String[] args) {
		
		
		int price = 3;
		int money = 20;
		int count = 4;
		long answer = 0;
		
		
		long sum = 0;
		for(int i=1;i<=count;i++) {
			
			sum += price*i;
		}
		
	
		answer = sum-money;
		if(answer<=0) {
			
			System.out.println(0);
			
		}else {
			
			System.out.println(answer);
			
		}
		
	}
}
