package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1439 {

	public static void main(String[] args) throws IOException {
		//버퍼드리더 오류가 없어졌다 ㅠㅠ String값을 받아서 그런가..
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String[] test = S.split("");
		
		int zero=0;
		int one =0;
	
		if(test[0].equals("0")) {
			zero++;
		}else {
			one++;
		}
		
		for(int i=1;i<test.length;i++) {
			
			if(!test[i].equals(test[i-1])) {
				
				if(test[i].equals("0")) {
					zero++;
				}else {
					one++;
				}
				
				
			}
		}
		
		System.out.println(Math.min(zero, one));
	}
}
