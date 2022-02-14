package Programmers_Level_1;

public class YandP {
	
	public static void main(String[] args) {
		
		String s = "pPoooyY";
		boolean answer = false;
		
		s = s.toLowerCase();
		int p = 0;
		int y = 0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='p'){
				p++;
			}else if(s.charAt(i)=='y'){
				y++;
			}
			
			
		}
		
		if(p==y) {
			answer = true;
			System.out.println(answer);
		}else {
			
			System.out.println(answer);
			
		}
		
	}

}
