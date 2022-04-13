package Today_22_04_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KoreanMarbleGame {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String fir = br.readLine();
		String sec = br.readLine();
		String thi = br.readLine();
		
		System.out.println(marble(fir));
		System.out.println(marble(sec));
		System.out.println(marble(thi));
		
	}
	public static String marble(String s) {
		
		int count = 0;
		String[]check = s.split(" ");
		
		for(String a : check) {
			
			if(a.equals("0")) count++;
		}
		
		if(count>=4) return "D";
		else if(count>=3) return "C";
		else if(count>=2) return "B";
		else if(count>=1) return "A";
		else return "E";
	}
}
