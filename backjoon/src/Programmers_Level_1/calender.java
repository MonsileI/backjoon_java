package Programmers_Level_1;

public class calender {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 24;
		
		check check = new check();
		
		String answer = check.day(a, b);
		
		System.out.println(answer);
		//7의 배수
		
//		31 1일 금요일 8일 금요일
//		29
//		31
//		30
//		31
//		30
//		31
//		31
//		30
//		31
//		30
//		31
		
		
		
	}
}


class check{
	
	public static String day(int a, int b) {
		
		String[] list = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int[] calander = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int day = 0;
		
		for(int i=0;i<a-1;i++) {
			
			day +=  calander[i];
			
		}
		day = day+ b-1;

		
		
		String answer = list[day%7];
		
		return answer;
		
		
	}
	
}