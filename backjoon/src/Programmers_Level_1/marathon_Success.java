package Programmers_Level_1;



public class marathon_Success {

	public static void main(String[] args) {
		
		String[]participant = {"mislav", "stanko", "mislav", "ana"};
		String[]completion = {"stanko", "ana", "mislav"};
		String answer = "";
		String check = "";
		
		for(int i=0;i<participant.length;i++) {
			
			
			for(int j=0;j<completion.length;j++) {
				
				if(participant[i].equals(completion[j])) {
					
					participant[i] = check;
					completion[j] = check;
				}
				
				
			}
			
		}
		
		for(int i=0;i<participant.length;i++) {
			
			if(!participant[i].equals(check)) {
				
				answer = participant[i];
				
				
			}
			
			
			
		}
		
		
		
		System.out.println(answer);
		
	}
		
}
