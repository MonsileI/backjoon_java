package Programmers_Level_1;



public class kakao_dartGame_First {
	
	public static void main(String[] args) {
		
		
		String s = "1D2S#10S";
		String temp = "";// 문자열 내 1번으 ㅣ점수 저장 변수
		int answer = 0;
		int arr[] = new int[3];
		int idx = 0; //배열 참조
		
		for(int i=0; i<s.length();i++) {
			
			switch(s.charAt(i)) {
			default:
				temp+=String.valueOf(s.charAt(i));
				break;
			case 'S':
				arr[idx] = (int)Math.pow(Integer.parseInt(temp),1);
				idx++;
				temp="";
				break;
			case 'D':
				arr[idx] = (int) Math.pow(Integer.parseInt(temp), 2);
				idx++;
				temp="";
				break;
			case 'T':
				arr[idx] = (int) Math.pow(Integer.parseInt(temp), 3);
				idx++;
				temp="";
				break;	
			case '*':
				arr[idx-1]*=2;
				if(idx >1) arr[idx-2]*=2;
				break;
				
			case '#':
				arr[idx-1]*=-1;
				break;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			answer += arr[i];
			
		}
		
		System.out.println(answer);
		
	}
}
