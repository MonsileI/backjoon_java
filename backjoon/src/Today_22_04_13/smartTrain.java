package Today_22_04_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class smartTrain {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<4;i++) {
			
			String num = br.readLine();
			
			String[]check = num.split(" ");
			
			arr.add(Integer.parseInt(check[0]));
			arr.add(Integer.parseInt(check[1]));
			
			
		}
		
		int answer = Integer.MIN_VALUE;
		int max = 0;
		for(int i=0;i<arr.size();i++) {
			
			if(i%2!=0) {
				max += arr.get(i);
			}else {
				max -= arr.get(i);
			}
			
			answer = Math.max(answer, max);
		}
		
		
		System.out.println(answer);
	}

}
