package Programmers_Level_1;

public class subaksubaksubak {
	
	public static void main(String[] args) {
		
		int n =3;
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			
			if(i%2==0) {
				sb.append("수");
				
			}else {
				sb.append("박");
			}
			
		}
		
		answer = sb.toString();
		
		System.out.println(answer);
		
	}

}
