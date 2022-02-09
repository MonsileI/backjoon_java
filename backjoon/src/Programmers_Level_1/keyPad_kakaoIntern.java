package Programmers_Level_1;

public class keyPad_kakaoIntern {

	public static void main(String[] args) {
		
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		StringBuilder sb = new StringBuilder("");
		String answer="";
		int right = 0;
		int left = 0;
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]%3==0&&numbers[i]!=0) {
				sb.append("R");
				right=numbers[i];
			}else if(numbers[i]%3==1) {
				sb.append("L");
				left=numbers[i];
				
			}else {
				int r = Math.abs(right-numbers[i]);
				int l = Math.abs(right-numbers[i]);
				
				if(r==l) {
					if(hand.equals("right")) {
						sb.append("R");
						right=numbers[i];
					}else{
						sb.append("L");
						left=numbers[i];
					}
				}else if(r!=l&&numbers[i]==0) {
					if(r>l) {
						sb.append("R");
						right=numbers[i];
					}else {
						sb.append("L");
						left=numbers[i];
					}
				
				}else {
					if(r<l) {
						sb.append("R");
						right=numbers[i];
					}else {
						sb.append("L");
						left=numbers[i];
					}
				}
			
			}
		}
	
		System.out.println(sb.toString());
	}
}
