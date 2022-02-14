package Programmers_Level_1;

public class plusbetweenAandB {

	public static void main(String[] args) {
		
		int a =3;
		int b= 5;
		Date0214 date0214 = new Date0214();
		
		long answer = date0214.easy(a, b);
		
		System.out.println(answer);
	}
}

class Date0214{
	
	public static long easy(int a,int b) {
		
		long easy = 0;
		
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		for(int i=min;i<=max;i++) {
			
			easy += i;
		}
		
		return easy;
		
	}
	
}
