package Programmers_Level_1;

public class numberAndAlphabat_2021_kakao_intern {
	
	public static void main(String[] args) {
		
	 change change = new change();
	 String S = "one4seveneight";
	 int a = change.yes(S);
		
	 System.out.println(a);
		
	}

}

class change{
	public static int yes(String S) {
		
		StringBuilder sb = new StringBuilder("");
		String [] num = {"0","1","2","3","4","5","6","7","8","9"};
		
		String[] alpha = {"zero","one","two","three","four","five","six",
							"seven","eight","nine"};
		
		for(int i=0;i<num.length;i++) {
			
			S = S.replaceAll(alpha[i],num[i]);
			
		
		}
		
		return Integer.parseInt(S);
}
	
}