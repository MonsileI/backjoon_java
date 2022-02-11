package Programmers_Level_1;

import java.util.ArrayList;

public class marathon_timeout {

	public static void main(String[] args) {
		
		String[]participant = {"mislav", "stanko", "mislav", "ana"};
		String[]completion = {"stanko", "ana", "mislav"};
		String answer = "";
		
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i=0;i<participant.length;i++) {
			
			al.add(participant[i]);
			
		}
		
		for(int i=0;i<completion.length;i++) {
			
			for(int j=0;j<al.size();j++) {
				
				if(al.get(j).equals(completion[i])) {
					
					al.remove(j);
				}
				
			}
			
		}
		
		answer= al.get(0);
		
		System.out.println(answer);
	}
		
}
